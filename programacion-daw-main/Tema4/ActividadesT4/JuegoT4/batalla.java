package Tema4.ActividadesT4.JuegoT4;

import java.util.ArrayList;
import java.util.Scanner;

public class batalla {
    private ArrayList<personaje> caballerosYMagos = new ArrayList<>();
    private ArrayList<personaje> orcos = new ArrayList<>();
    private Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        batalla juego = new batalla();
        juego.mostrarMenu();
    }

    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Crear personaje");
            System.out.println("2. Iniciar batalla");
            System.out.println("3. Mostrar listas");
            System.out.println("4. Mostrar menú");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion = teclado.nextInt();
            teclado.nextLine(); 
            
            switch (opcion) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    iniciarBatalla();
                    break;
                case 3:
                    muestraListas();
                    break;
                case 4:
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void crearPersonaje() {
        System.out.println("CREAR PERSONAJE");
        System.out.println("Elige el tipo de personaje:");
        System.out.println("1. Caballero");
        System.out.println("2. Mago");
        System.out.println("3. Orco");
        System.out.print("Opción: ");
        
        int tipo = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Nombre del personaje: ");
        String nombre = teclado.nextLine();
        
        Tipo tipoEnum = null;
       
        
        switch (tipo) {
            case 1: // Caballero
                tipoEnum = Tipo.Caballero;
                System.out.println("Introduce vida, daño y defensa del Caballero:");
                int vida1 = teclado.nextInt();
                int daño1 = teclado.nextInt();
                int defensa1 = teclado.nextInt();
                System.out.println("Caballero creado: " + vida1 + " vida, " + daño1 + " daño, " + defensa1 + " defensa.");
                personaje caballero = new personaje(tipoEnum);
                caballero.setNombre(nombre);
                caballero.setVida(vida1);
                caballero.setDaño(daño1);
                caballero.setDefensa(defensa1);
                caballerosYMagos.add(caballero);
                break;
            case 2: // Mago
                tipoEnum = Tipo.Mago;
                System.out.println("Introduce vida, daño y defensa del Mago:");
                int vida2 = teclado.nextInt();
                int daño2 = teclado.nextInt();
                int defensa2 = teclado.nextInt();
                System.out.println("Mago creado: " + vida2 + " vida, " + daño2 + " daño, " + defensa2 + " defensa.");
                personaje mago = new personaje(tipoEnum);
                mago.setNombre(nombre);
                mago.setVida(vida2);
                mago.setDaño(daño2);
                mago.setDefensa(defensa2);
                caballerosYMagos.add(mago);
                break;
            case 3: // Orco
                tipoEnum = Tipo.Orco;
                System.out.println("Introduce vida, daño y defensa del Orco:");
                int vida3 = teclado.nextInt();
                int daño3 = teclado.nextInt();
                int defensa3 = teclado.nextInt();
                System.out.println("Orco creado: " + vida3 + " vida, " + daño3 + " daño, " + defensa3 + " defensa.");
                personaje orco = new personaje(tipoEnum);
                orco.setNombre(nombre);
                orco.setVida(vida3);
                orco.setDaño(daño3);
                orco.setDefensa(defensa3);
                orcos.add(orco);
                break;
            default:
                System.out.println("Tipo no válido.");
        }
    }

    public void muestraListas() {
        System.out.println("Lista de personajes");
        
        System.out.println("Caballeros y Magos");
        if (caballerosYMagos.isEmpty()) {
            System.out.println("(Lista vacia)");
        } else {
            for (int i = 0; i < caballerosYMagos.size(); i++) {
                System.out.println((i + 1) + ". " + caballerosYMagos.get(i));
            }
        }
        
        System.out.println("Orcos");
        if (orcos.isEmpty()) {
            System.out.println("(Lista vacia)");
        } else {
            for (int i = 0; i < orcos.size(); i++) {
                System.out.println((i + 1) + ". " + orcos.get(i));
            }
        }
    }

    public void iniciarBatalla() {
        System.out.println("Iniciar batalla");
        
        if (caballerosYMagos.isEmpty() || orcos.isEmpty()) {
            System.out.println("Necesitas al menos un personaje en cada lista para iniciar la batalla.");
            return;
        }
        
        // Seleccionar combatientes
        System.out.println("Elige un Caballero o Mago:");
        muestraListaCombatientes(caballerosYMagos);
        System.out.print("Opcion: ");
        int opcion1 = teclado.nextInt() - 1;
        
        if (opcion1 < 0 || opcion1 >= caballerosYMagos.size()) {
            System.out.println("Opcion no válida.");
            return;
        }
        
        personaje combatiente1 = caballerosYMagos.get(opcion1);
        
        System.out.println("Elige un Orco:");
        muestraListaCombatientes(orcos);
        System.out.print("Opcion: ");
        int opcion2 = teclado.nextInt() - 1;
        
        if (opcion2 < 0 || opcion2 >= orcos.size()) {
            System.out.println("Opcion no válida.");
            return;
        }
        
        personaje combatiente2 = orcos.get(opcion2);
        
        // Batalla
        System.out.println("Empieza la batalla");
        System.out.println(combatiente1.getNombre() + " vs " + combatiente2.getNombre());
        System.out.println();
        
        batallaTurnosJuego(combatiente1, combatiente2, caballerosYMagos, orcos, opcion1, opcion2);
        
        // Mostrar resultado
        System.out.println("Fin de la batlla");
        if (combatiente1.getVida() > 0) {
            System.out.println("¡" + combatiente1.getNombre() + " ha ganado!");
        } else {
            System.out.println("¡" + combatiente2.getNombre() + " ha ganado!");
        }
        System.out.println("Estado final:");
        System.out.println(combatiente1);
        System.out.println(combatiente2);
        
        // Verificar si una lista está vacía (ganador del campeonato)
        if (orcos.isEmpty()) {
            System.out.println("Caballeros y magon han ganado");
            for (personaje p : caballerosYMagos) {
                System.out.println("- " + p.getNombre() + " [Vida: " + p.getVida() + "]");
            }
        } else if (caballerosYMagos.isEmpty()) {
            System.out.println("Orcos han ganado");
            for (personaje p : orcos) {
                System.out.println("- " + p.getNombre() + " [Vida: " + p.getVida() + "]");
            }
        }
    }

    private void muestraListaCombatientes(ArrayList<personaje> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i).getNombre() + " [Vida: " + lista.get(i).getVida() + "]");
        }
    }

    private void batallaTurnosJuego(personaje p1, personaje p2, ArrayList<personaje> lista1, ArrayList<personaje> lista2, int indice1, int indice2) {
        int turno = 1;
        
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            System.out.println("Turno" + turno + " ");
            
            // Turno de p1
            p1.Atacar(p2);
            System.out.println(p1.getNombre() + " ataca a " + p2.getNombre() + " causando daño.");
            System.out.println(p2.getNombre() + " ahora tiene " + p2.getVida() + " puntos de vida.");
            
            if (p2.getVida() <= 0) {
                System.out.println(p2.getNombre() + " ha sido derrotado.");
                lista2.remove(indice2); // Remover del Orco
                break;
            }
            
            System.out.println();
            
            // Turno de p2
            p2.Atacar(p1);
            System.out.println(p2.getNombre() + " ataca a " + p1.getNombre() + " causando daño.");
            System.out.println(p1.getNombre() + " ahora tiene " + p1.getVida() + " puntos de vida.");
            
            if (p1.getVida() <= 0) {
                System.out.println(p1.getNombre() + " ha sido derrotado.");
                lista1.remove(indice1); // Remover de caballerosYMagos
                break;
            }
            
            System.out.println();
            turno++;
        }
    }
}
