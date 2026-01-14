package Tema5;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ejemplo {
 public static void main(String[] args) {
 // Rutas de entrada y salida
 String rutaEntrada = "./Tema5/ejemplo.jpg";
 String rutaSalida = "./Tema5/fotogris.png";
 try {
 // Leer imagen JPEG
 BufferedImage imagenColor = ImageIO.read(new File(rutaEntrada));
 if (imagenColor == null) {
 System.out.println("No se pudo leer la imagen. Verifica la ruta y el archivo.");
 return;
 }
 // Crear una imagen en escala de grises
 BufferedImage imagenGris = new BufferedImage(
 imagenColor.getWidth(),
 imagenColor.getHeight(),
 BufferedImage.TYPE_BYTE_GRAY
 );
 // Convertir pixel por pixel a escala de grises
 for (int y = 0; y < imagenColor.getHeight(); y++) {
 for (int x = 0; x < imagenColor.getWidth(); x++) {
 Color color = new Color(imagenColor.getRGB(x, y));
int gris = (int)(color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);
int nuevoColor = new Color(gris, gris, gris).getRGB();
imagenGris.setRGB(x, y, nuevoColor);
 }
 }
 // Guardar como PNG
 boolean resultado = ImageIO.write(imagenGris, "png", new File(rutaSalida));
 if (resultado) {
 System.out.println("Conversión completada: imagen en escala de grises guardada como " + rutaSalida);
 } else {
 System.out.println("No fue posible guardar la imagen.");
 }
 } catch (IOException e) {
 System.err.println("Error al leer o escribir la imagen: " + e.getMessage());
 }
 }
}