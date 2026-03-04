package src.vista;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProveedorVista extends JPanel {
    public JTextField txtcodigo = new JTextField(5);
    public JTextField txtdireccion = new JTextField(5);
    public JTextField txtciudad = new JTextField(10);
    public JTextField txtprovincia = new JTextField(10);

    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Definición de columnas clara
    public DefaultTableModel modeloTabla = new DefaultTableModel(
        new Object[] {"codigo", "direccion", "ciudad", "provincia"}, 0 
    );
    public JTable tabla = new JTable(modeloTabla);
    

    public ProveedorVista(){
        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Proveedor"));

        panelFormulario.add(new JLabel("Codigo:"));
        panelFormulario.add(txtcodigo);
        panelFormulario.add(new JLabel("Direccion:"));
        panelFormulario.add(txtdireccion);
        panelFormulario.add(new JLabel("Ciudad:"));
        panelFormulario.add(txtciudad);
        panelFormulario.add(new JLabel("Provincia:"));
        panelFormulario.add(txtprovincia);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Listado Proveedores"));

        // NORTH para el formulario, CENTER para la tabla (así se ven ambos)
        add(panelFormulario, BorderLayout.NORTH); 
        add(scroll, BorderLayout.CENTER);
    }
}
