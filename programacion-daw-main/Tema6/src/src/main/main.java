package src.main;

import javax.swing.*;
import src.vista.CategoriaVista;
import src.vista.PiezaVista;
import src.vista.ProveedorVista;
import src.vista.SuministroVista;
import src.controlador.CategoriaController;
import src.controlador.PiezaController;
import src.controlador.ProveedorController;
import src.controlador.SuministroController;
import src.modelo.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("IES Cura Valera");
        //Crear el JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 300, 200);
        CategoriaVista vista = new CategoriaVista();
        PiezaVista view2 = new PiezaVista();
        ProveedorVista view3 = new ProveedorVista();
        SuministroVista view4 = new SuministroVista();

        //Añadir paneles como pestañas
        tabbedPane.add("Categoria", vista);
        tabbedPane.add("Pieza", view2);
        tabbedPane.add("Proveedor", view3);
        tabbedPane.add("Suministra", view4);

        //Definir el controlador asociado
        CategoriaController c1 = new CategoriaController(vista);
        PiezaController c2 = new PiezaController(view2);
        ProveedorController c3 = new ProveedorController(view3);
        SuministroController c4 = new SuministroController(view4);

        //Asociar el TabbedPane
        frame.setContentPane(tabbedPane);
       //Tamaño y visibilidad
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
