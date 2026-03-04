package src.controlador;

import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import src.modelo.*;
import src.vista.ProveedorVista;

public class ProveedorController {
    private ProveedorVista vista;
    private ProveedorDAO dao = new ProveedorDAO();

    public ProveedorController(ProveedorVista vista) {
        this.vista = vista;
        initController();
        cargarTabla();
    }

    private void initController() {
        vista.btnInsertar.addActionListener(e -> insertar());
        vista.btnActualizar.addActionListener(e -> actualizar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnLimpiar.addActionListener(e -> limpiar());
        
        vista.tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) seleccionarFila();
        });
    }

    private void cargarTabla() {
    vista.modeloTabla.setRowCount(0);
    List<Proveedor> lista = dao.listar();
    for (Proveedor p : lista) {
        // El orden aquí DEBE ser el mismo que en el modelo de la vista
        vista.modeloTabla.addRow(new Object[]{
            p.getCodigo(),    
            p.getDireccion(),
            p.getCiudad(),    
            p.getProvincia()  
        });
    }
}

    private void seleccionarFila() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        vista.txtcodigo.setText(vista.modeloTabla.getValueAt(fila, 0).toString());
        vista.txtdireccion.setText(vista.modeloTabla.getValueAt(fila, 1).toString());
        vista.txtciudad.setText(vista.modeloTabla.getValueAt(fila, 2).toString());
        vista.txtprovincia.setText(vista.modeloTabla.getValueAt(fila, 3).toString());
    }

 private void insertar() {
    try {
        int codigo = Integer.parseInt(vista.txtcodigo.getText()); 
        
        String direccion = vista.txtdireccion.getText();
        String ciudad = vista.txtciudad.getText();
        String provincia = vista.txtprovincia.getText();

        dao.insertar(codigo, direccion, ciudad, provincia);

        cargarTabla();
        limpiar();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(vista, "El Código debe ser un número válido.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(vista, "Error inesperado: " + e.getMessage());
    }
}

    private void actualizar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        try {
            int codigo = Integer.parseInt(vista.txtcodigo.getText());
            String direccion = vista.txtdireccion.getText();

            dao.actualizar(codigo, direccion);
            cargarTabla();
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error al actualizar");
        }
    }

    private void eliminar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        int codigo = Integer.parseInt(vista.txtcodigo.getText());
        
        dao.borrar(codigo);
        cargarTabla();
        limpiar();
    }

    private void limpiar() {
        vista.txtcodigo.setText("");
        vista.txtdireccion.setText("");
        vista.txtciudad.setText("");
        vista.txtprovincia.setText("");
        vista.tabla.clearSelection();
    }
}
