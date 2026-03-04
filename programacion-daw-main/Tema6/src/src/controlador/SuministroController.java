package src.controlador;

import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import src.modelo.*;
import src.vista.SuministroVista;

public class SuministroController {
    private SuministroVista vista;
    private SuministroDAO dao = new SuministroDAO();

    public SuministroController(SuministroVista vista) {
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
        List<Suministro> lista = dao.listar();
        for (Suministro s : lista) {
            vista.modeloTabla.addRow(new Object[]{
                s.getCodProveedor(), s.getCodPieza(), s.getCantidad(), s.getFecha()
            });
        }
    }

    private void seleccionarFila() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        vista.txtCodigo_proveedor.setText(vista.modeloTabla.getValueAt(fila, 0).toString());
        vista.txtCodigo_pieza.setText(vista.modeloTabla.getValueAt(fila, 1).toString());
        vista.txtCantidad.setText(vista.modeloTabla.getValueAt(fila, 2).toString());
        vista.txtFecha.setText(vista.modeloTabla.getValueAt(fila, 3).toString());
    }

    private void insertar() {
        try {
            int prov = Integer.parseInt(vista.txtCodigo_proveedor.getText());
            int pieza = Integer.parseInt(vista.txtCodigo_pieza.getText());
            int cant = Integer.parseInt(vista.txtCantidad.getText());
            Date fecha = Date.valueOf(vista.txtFecha.getText());
            

            dao.insertar(prov, pieza, cant, fecha);
            cargarTabla();
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error en datos o fecha (dd/mm/yyyy)");
        }
    }

    private void actualizar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        try {
            int prov = Integer.parseInt(vista.modeloTabla.getValueAt(fila, 0).toString());
            int pieza = Integer.parseInt(vista.modeloTabla.getValueAt(fila, 1).toString());
            int nuevaCant = Integer.parseInt(vista.txtCantidad.getText());

            dao.actualizarCantidad(prov, pieza, nuevaCant);
            cargarTabla();
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error al actualizar");
        }
    }

    private void eliminar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;
        int prov = Integer.parseInt(vista.modeloTabla.getValueAt(fila, 0).toString());
        int pieza = Integer.parseInt(vista.modeloTabla.getValueAt(fila, 1).toString());
        
        dao.borrar(prov, pieza);
        cargarTabla();
        limpiar();
    }

    private void limpiar() {
        vista.txtCodigo_proveedor.setText("");
        vista.txtCodigo_pieza.setText("");
        vista.txtCantidad.setText("");
        vista.txtFecha.setText("");
        vista.tabla.clearSelection();
    }
}