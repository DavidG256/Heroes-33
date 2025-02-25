import java.util.ArrayList;
import java.util.Scanner;

public class Heroe {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private String armaEspecial;
    ArrayList<Heroe> listaHeroes = new ArrayList<>();


    public Heroe(String nombre, int nivel, int puntosDeVida, String armaEspecial) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.armaEspecial = armaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    @Override
    public String toString() {
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", armaEspecial='" + armaEspecial + '\'' +
                '}';
    }


    public void elegirHeroe(){
        Scanner scanner = new Scanner(System.in);
        boolean boleano = true;
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.println("4. Asesino");
        int opcion = scanner.nextInt();
        if (opcion  > 4 || opcion < 1){
            System.out.println("Elegir una opcion valida");

        }else{
           if (boleano) {
               if (opcion == 1){
                   System.out.println("Cual es el nombre del guerrero?");
                   String nombre = scanner.next();
                   int nivel = scanner.nextInt();
                   System.out.println("Elige tu nivel");
                   int vida = scanner.nextInt();
                   System.out.println("ELige tus puntos de vida");
                   int fuerza = scanner.nextInt();
                   System.out.println("Elige cuanta fuerza ");
                   System.out.println("Nombre Guerrero");
                   System.out.println("Nivel " + nivel);
                   System.out.println("Puntos vida" + vida);
                   System.out.println("Furza" + fuerza);
                   System.out.println();
                   listaHeroes.add(new Guerrero("Alfredo", 23, 43, "Hacha", 56));

               } else if (opcion == 2) {
                   System.out.println("¿Cual es el nombre del mago?");
                   String nombre = scanner.next();
                   int nivel = scanner.nextInt();
                   System.out.println("¿Cual es el nivel del mago?");
                   int fuerza = scanner.nextInt();
                   System.out.println("cual es tu nivel de fuerza??");
                   int mana = scanner.nextInt();
                   System.out.println("Cuales son tus puntos de vida" + puntosDeVida);
                   int puntosVida = scanner.nextInt();
                   System.out.println("cual es tu mana?");
                   System.out.println("Nombre del Mago?");
                   System.out.println("Nivel" + nivel);
                   System.out.println("Puntos vida" + puntosVida);
                   System.out.println("Furza" + fuerza);
                   System.out.println();
                   listaHeroes.add(new Mago("Harry Potter", 67, 89, "Varita", 45));

               }else if (opcion == 3){
                   System.out.println("Cual es el nombre del arquero?");
                   String nombre = scanner.next();
                   System.out.println("cual es tu nivel");
                   int nivel = scanner.nextInt();
                   System.out.println("Cual es tu fuerza?");
                   int fuerza = scanner.nextInt();
                   System.out.println("¿Cuántos puntos de vida tiene?");
                   int pv = scanner.nextInt();
                   System.out.println("¿Cuanta precision tiene el Arquero?");
                   int punteria = scanner.nextInt();
                   System.out.println("Nombre del Arquero: " + nombre);
                   System.out.println("Nivel: " + nivel);
                   System.out.println("Puntos de Vida: " + pv);
                   System.out.println("Punteria: " + punteria);
                   System.out.println();
                  listaHeroes.add(new Arquero("Legolas", 39, 65, "Arco con flechas Daedricas", 90));

               }else if (opcion == 4){
                   System.out.println("Cual es el nombre del asesino");
                   String nombre = scanner.next();
                   System.out.println("cual es tu nivel");
                   int nivel = scanner.nextInt();
                   System.out.println("Cual es tu fuerza?");
                   int fuerza = scanner.nextInt();
                   System.out.println("¿Cuántos puntos de vida tiene?");
                   int pv = scanner.nextInt();
                   System.out.println("¿Cuanto sigilo tiene el asesinp");
                   int sigilo = scanner.nextInt();
                   System.out.println("Nombre del Arquero: " + nombre);
                   System.out.println("Nivel: " + nivel);
                   System.out.println("Puntos de Vida: " + pv);
                   System.out.println("sigilo: " + sigilo);
                   System.out.println();
                   listaHeroes.add(new Asesino("Spiderman", 99, 188, "Telarañas", 67));

               }

           }

        }


    }

    public void elegirArma(){
        Scanner scanner = new Scanner(System.in);
        boolean bo = true;
        System.out.println("1. Arma del Guerrero");
        System.out.println("2. Arma del Mago");
        System.out.println("3. Arma del Arquero");
        System.out.println("4. Arma del Asesino");


        int opcion = scanner.nextInt();
        if (opcion > 4 || opcion < 1){
            System.out.println("Elegir una opcion valida");
        }else {
            if (bo){
                if (opcion == 1){
                    System.out.println("Has elegido Hacha  " + armaEspecial);
                    System.out.println();
                }

            }else if (opcion == 2){
                System.out.println("Has elegido " + armaEspecial);

            }else if (opcion == 3){
                System.out.println("Has elegido" + armaEspecial);

            }else if (opcion == 4){
                System.out.println("Has elegido" + armaEspecial);

            }

        }

    }

}
