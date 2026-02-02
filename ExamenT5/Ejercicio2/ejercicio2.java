package ExamenT5.Ejercicio2;


import java.nio.file.*;
import java.util.*;
import org.json.*;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {

        String contenido = Files.readString(Paths.get("ExamenT5/Ejercicio2/empleados.json"));
        JSONObject objeto = new JSONObject(contenido);

        JSONArray empleados = objeto.getJSONArray("empleados");
        JSONObject direccion = objeto.getJSONObject("direccion");

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1- Empleados activos");
            System.out.println("2- Empleados con rol admin");
            System.out.println("3- Datos de la empresa");
            System.out.println("4- Buscar empleado");
            System.out.println("5- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    int activos = 0;
                    System.out.println("Activos:");
                    for (int i = 0; i < empleados.length(); i++) {
                        JSONObject e = empleados.getJSONObject(i);
                        if (e.getBoolean("activo")) {
                            activos++;
                            System.out.println(e.getString("nombre"));
                        }
                    }
                    System.out.println("Total activos: " + activos);
                    break;

                case 2:
                    int admins = 0;
                    for (int i = 0; i < empleados.length(); i++) {
                        JSONObject e = empleados.getJSONObject(i);
                        JSONArray roles = e.getJSONArray("roles");
                        for (int j = 0; j < roles.length(); j++) {
                            if (roles.getString(j).equals("admin")) {
                                admins++;
                            }
                        }
                    }
                    System.out.println("Total administradores: " + admins);
                    break;

                case 3:
                    System.out.println("Empresa: " + objeto.getString("empresa"));
                    System.out.println("Ciudad: " + direccion.getString("ciudad"));
                    System.out.println("País: " + direccion.getString("pais"));
                    break;

                case 4:
                    System.out.print("Nombre del empleado: ");
                    String nombre = teclado.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < empleados.length(); i++) {
                        JSONObject e = empleados.getJSONObject(i);
                        if (e.getString("nombre").equalsIgnoreCase(nombre)) {
                            System.out.println("ID: " + e.getInt("id"));
                            System.out.println("Roles: " + e.getJSONArray("roles"));
                            System.out.println("Activo: " + e.getBoolean("activo"));
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No es empleado.");
                    }
                    break;
            }

        } while (opcion != 5);
    }
}
