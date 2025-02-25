public class Asesino extends Heroe {
    private int sigilo;

    public Asesino(String nombre, int nivel, int puntosDeVida, String armaEspecial, int sigilo) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.sigilo = sigilo;
    }

    @Override
    public String toString() {
        return "Asesino{" +
                "sigilo=" + sigilo +
                '}';
    }
}
