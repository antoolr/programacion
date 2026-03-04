package src.controlador;


import src.modelo.Categoria;
import src.modelo.CategoriaDAO;
import src.vista.CategoriaVista;

import javax.swing.*;
import java.util.List;

public class CategoriaController {
    private CategoriaVista vista;
    private CategoriaDAO dao = new CategoriaDAO();

    public CategoriaController(CategoriaVista vista){
        this.vista = vista;

    initController();
    cargarTabla();
    }

     private void initController(){
    vista.btnInsertar.addActionListener(e -> insertar());
    vista.btnActualizar.addActionListener(e -> actualizar());
    vista.btnEliminar.addActionListener(e -> eliminar());
    vista.btnLimpiar.addActionListener(e -> limpiar());

    vista.tabla.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            seleccionarFila();
        }
    });
    } 

    private void actualizar() {
        int fila = vista.tabla.getSelectedRow();
        if(fila == -1) return;

        try {
            int codigo = Integer.parseInt(vista.txtCodigo.getText());
            String nombre = vista.txtNombre.getText();

            dao.actualizar(new Categoria(codigo, nombre));

            cargarTabla();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Codigo invalido");
        }
    }

    private void insertar (){
        try{
        int codigo = Integer.parseInt(vista.txtCodigo.getText());
        String nombre = vista.txtNombre.getText();

        dao.insertar(new Categoria(codigo, nombre));

        cargarTabla();
        limpiar();
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(vista, "Codigo invalido");
        }
    }

    private void eliminar (){
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        int codigo = Integer.parseInt(vista.modeloTabla.getValueAt(fila, 0).toString());

        dao.eliminar(codigo);

        cargarTabla();
        limpiar();
    }

    private void seleccionarFila(){
        int fila = vista.tabla.getSelectedRow();
        if(fila== -1) return;

        vista.txtCodigo.setText(vista.modeloTabla.getValueAt(fila, 0).toString());

        vista.txtNombre.setText(vista.modeloTabla.getValueAt(fila, 1).toString());
    }

    private void cargarTabla(){
        vista.modeloTabla.setRowCount(0);

        List<Categoria> lista = dao.listar();

        for (Categoria c : lista){
            vista.modeloTabla.addRow(new Object[]{
            c.getId(),
            c.getNombre()
            });
        }
    }

    private void limpiar(){
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.tabla.clearSelection();
    }
    }




