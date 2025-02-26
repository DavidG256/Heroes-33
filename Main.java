import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Heroe> heroes = new ArrayList<>();
    private static List<ArmaEspecial> arsenal = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarArmas();
        boolean salir = false;

        while (!salir) {
            System.out.println(" Menú de Gestión de Héroes ---");
            System.out.println("1. Añadir Héroe");
            System.out.println("2. Añadir Arma a un Héroe");
            System.out.println("3. Eliminar Héroe");
            System.out.println("4. Buscar Héroe");
            System.out.println("5. Listar Héroes");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    añadirHeroe();
                    break;
                case 2:
                    añadirArmaAHeroe();
                    break;
                case 3:
                    eliminarHeroe();
                    break;
                case 4:
                    buscarHeroe();
                    break;
                case 5:
                    listarHeroes();
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void inicializarArmas() {
        arsenal.add(new ArmaEspecial("Espada de Fuego", 50));
        arsenal.add(new ArmaEspecial("Arco Élfico", 40));
        arsenal.add(new ArmaEspecial("Daga Sombría", 30));
    }

    private static void añadirHeroe() {
        System.out.println("\nSelecciona tipo de héroe:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.println("4. Asesino");
        System.out.print("Elige una opción: ");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre del héroe: ");
        String nombre = scanner.nextLine();
        System.out.print("Nivel: ");
        int nivel = scanner.nextInt();
        System.out.print("Puntos de Vida: ");
        int vida = scanner.nextInt();

        Heroe heroe = null;

        switch (tipo) {
            case 1:
                heroe = new Guerrero(nombre, nivel, vida, 100);
                break;
            case 2:
                heroe = new Mago(nombre, nivel, vida, 200);
                break;
            case 3:
                heroe = new Arquero(nombre, nivel, vida, 80);
                break;
            case 4:
                heroe = new Asesino(nombre, nivel, vida, 90);
                break;
            default:
                System.out.println("Tipo de héroe inválido.");
                return;
        }

        heroes.add(heroe);
        System.out.println(nombre + " ha sido añadido al gremio.");
    }

    private static void añadirArmaAHeroe() {
        System.out.print("\nNombre del héroe: ");
        String nombre = scanner.nextLine();

        for (Heroe h : heroes) {
            if (h.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Elige un arma:");
                for (int i = 0; i < arsenal.size(); i++) {
                    System.out.println((i + 1) + ". " + arsenal.get(i));
                }
                System.out.print("Elige una opción: ");
                int eleccion = scanner.nextInt() - 1;
                scanner.nextLine(); // Limpiar buffer

                if (eleccion >= 0 && eleccion < arsenal.size()) {
                    h.agregarArma(arsenal.get(eleccion));
                    System.out.println("Arma añadida con éxito.");
                } else {
                    System.out.println("Selección inválida.");
                }
                return;
            }
        }
        System.out.println("Héroe no encontrado.");
    }

    private static void eliminarHeroe() {
        System.out.print("\nNombre del héroe a eliminar: ");
        String nombre = scanner.nextLine();

        for (Heroe h : heroes) {
            if (h.getNombre().equalsIgnoreCase(nombre)) {
                heroes.remove(h);
                System.out.println(nombre + " ha sido eliminado.");
                return;
            }
        }
        System.out.println("Héroe no encontrado.");
    }

    private static void buscarHeroe() {
        System.out.print("\nNombre del héroe a buscar: ");
        String nombre = scanner.nextLine();

        for (Heroe h : heroes) {
            if (h.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(h);
                return;
            }
        }
        System.out.println("Héroe no encontrado.");
    }

    private static void listarHeroes() {
        if (heroes.isEmpty()) {
            System.out.println("\nNo hay héroes registrados.");
        } else {
            System.out.println("\nLista de Héroes:");
            for (Heroe h : heroes) {
                System.out.println(h);
            }
        }
    }
}