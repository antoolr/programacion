package src.controlador;

import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import src.modelo.*;
import src.vista.PiezaVista;
import src.vista.ProveedorVista;

public class PiezaController {
    private PiezaVista vista;
    private PiezaDAO dao = new PiezaDAO();

    public PiezaController(PiezaVista vista) {
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
    List<Pieza> lista = dao.listar();
    for (Pieza p : lista) {
        // El orden aquí DEBE ser el mismo que en el modelo de la vista
        vista.modeloTabla.addRow(new Object[]{
            p.getCodigo(),    
            p.getNombre(),
            p.getColor(),    
            p.getPrecio(),
            p.getCodCategoria()  
        });
    }
}

    private void seleccionarFila() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        vista.txtcodigo.setText(vista.modeloTabla.getValueAt(fila, 0).toString());
        vista.txtnombre.setText(vista.modeloTabla.getValueAt(fila, 1).toString());
        vista.txtcolor.setText(vista.modeloTabla.getValueAt(fila, 2).toString());
        vista.txtprecio.setText(vista.modeloTabla.getValueAt(fila, 3).toString());
        vista.txtCodigocategoria.setText(vista.modeloTabla.getValueAt(fila, 4).toString());
    }

 private void insertar() {
    try {
        int codigo = Integer.parseInt(vista.txtcodigo.getText()); 
        String nombre = vista.txtnombre.getText();
        String color = vista.txtcolor.getText();
        double precio = Integer.parseInt(vista.txtprecio.getText());
        int codigocat = Integer.parseInt(vista.txtCodigocategoria.getText());

        dao.insertar(codigo, nombre, color, precio, codigocat);

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
            double precio = Integer.parseInt(vista.txtprecio.getText());

            dao.actualizarPrecio(codigo, precio);
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
        vista.txtnombre.setText("");
        vista.txtcolor.setText("");
        vista.txtprecio.setText("");
        vista.txtCodigocategoria.setText("");
        vista.tabla.clearSelection();
    }
}
