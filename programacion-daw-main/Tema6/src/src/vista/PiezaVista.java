package src.vista;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PiezaVista extends JPanel {
    public JTextField txtcodigo = new JTextField(5);
    public JTextField txtnombre = new JTextField(10);
    public JTextField txtcolor = new JTextField(5);
    public JTextField txtprecio = new JTextField(5);
    public JTextField txtCodigocategoria = new JTextField(5);

    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Definición de columnas clara
    public DefaultTableModel modeloTabla = new DefaultTableModel(
        new Object[] {"codigo", "nombre", "color", "precio", "Codigo categoria"}, 0 
    );
    public JTable tabla = new JTable(modeloTabla);
    

    public PiezaVista(){
        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Pieza"));

        panelFormulario.add(new JLabel("Codigo:"));
        panelFormulario.add(txtcodigo);
        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtnombre);
        panelFormulario.add(new JLabel("Color:"));
        panelFormulario.add(txtcolor);
        panelFormulario.add(new JLabel("Precio:"));
        panelFormulario.add(txtprecio);
        panelFormulario.add(new JLabel("Codigo categoria:"));
        panelFormulario.add(txtCodigocategoria);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Listado Piezas"));

        // NORTH para el formulario, CENTER para la tabla (así se ven ambos)
        add(panelFormulario, BorderLayout.NORTH); 
        add(scroll, BorderLayout.CENTER);
    }
}
