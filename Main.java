import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir){
            System.out.println("Menu");
            System.out.println("1. Añadir un nuevo heroe");
            System.out.println("2. Añadir un arma nueva al arsenal");
            System.out.println("3. Eliminar Heroe");
            System.out.println("4. Buscar Heroes");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion){
                case 1:
                    System.out.println("Añada el nuevo heroe");
                    String HeroeNuevo = scanner.nextLine();

                    break;

                case 2:
                    System.out.println("Añada un arma nueva al arsenal");

                    break;

                case 3:
                    System.out.println("Añade  ");
                    break;

                case 4:
                    System.out.println();

                    break;
            }
        }


    }

}
