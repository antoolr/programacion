package src.vista;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SuministroVista extends JPanel {
    public JTextField txtCodigo_proveedor = new JTextField(5);
    public JTextField txtCodigo_pieza = new JTextField(5);
    public JTextField txtCantidad = new JTextField(10);
    public JTextField txtFecha = new JTextField(10);

    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Definición de columnas clara
    public DefaultTableModel modeloTabla = new DefaultTableModel(
        new Object[] {"Cod. Proveedor", "Cod. Pieza", "Cantidad", "Fecha"}, 0 
    );
    public JTable tabla = new JTable(modeloTabla);

    public SuministroVista(){
        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Suministro"));

        panelFormulario.add(new JLabel("Proveedor:"));
        panelFormulario.add(txtCodigo_proveedor);
        panelFormulario.add(new JLabel("Pieza:"));
        panelFormulario.add(txtCodigo_pieza);
        panelFormulario.add(new JLabel("Cantidad:"));
        panelFormulario.add(txtCantidad);
        panelFormulario.add(new JLabel("Fecha (dd/mm/yyyy):"));
        panelFormulario.add(txtFecha);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Listado Suministros"));

        // NORTH para el formulario, CENTER para la tabla (así se ven ambos)
        add(panelFormulario, BorderLayout.NORTH); 
        add(scroll, BorderLayout.CENTER);
    }
}