package src.vista;


import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class CategoriaVista extends JPanel {
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtNombre = new JTextField(15);

    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[] {"Codigo", "Nombre"}, 0 );
    public JTable tabla = new JTable(modeloTabla);

    public CategoriaVista(){
        setLayout (new BorderLayout());

        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos categoria"));

        panelFormulario.add(new JLabel("Codigo"));
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel("Nombre"));
        panelFormulario.add(txtNombre);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(
            BorderFactory.createTitledBorder("Listado categorias"));

        add(panelFormulario, BorderLayout.NORTH); 

        add(scroll, BorderLayout.CENTER);


    }

}
