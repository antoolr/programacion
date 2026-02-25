import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputAdapter;

import org.w3c.dom.events.MouseEvent;

// 1) Creamos la clase ventana
public class App extends JFrame {


 public App() {
 initComponents();
 }
 private void initComponents() {
 // Configuramos los parámetros de la ventana
 setTitle("Ejemplo de ventana");
 setLocation(200,500); //setLocationRelativeTo(null);
 setSize(300, 200);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 // 2) Crear los componentes
 JLabel etiqueta1 = new JLabel("Primer numero");
 JTextField campoDeTexto = new JTextField(20);
JLabel etiqueta2 = new JLabel("Segundo numero");
 JTextField campoDeTexto2 = new JTextField(20);
 JButton boton2 = new JButton("Sumar");
 JButton boton3 = new JButton("Restar");
 JLabel etiqueta3 = new JLabel("Resultado");
 JTextField campoDeTexto3 = new JTextField(20);
boton2.addActionListener(null);

// 3) Crear un contenedor
 JPanel panelDeContenido = new JPanel();
 // 4) Asociar los componentes al contenedor
 panelDeContenido.add(etiqueta1);
 panelDeContenido.add(campoDeTexto);
  panelDeContenido.add(etiqueta2);
 panelDeContenido.add(campoDeTexto2);
 panelDeContenido.add(boton2);
 panelDeContenido.add(boton3);
 panelDeContenido.add(etiqueta3);
 panelDeContenido.add(campoDeTexto3);
 // 5) Asociar el contenedor a la ventana
 setContentPane(panelDeContenido);
 // 6) Hacer visible la ventana
 setVisible(true);
 }


 
 public static void main(String[] args) {
 App ejemplo = new App();
 
 }
}
