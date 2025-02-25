public class Guerrero extends Heroe {
    protected int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, String armaEspecial, int fuerza) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "fuerza=" + fuerza +
                '}';
    }


}
