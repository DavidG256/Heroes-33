public class Arquero extends Heroe {
    private int precision;

    public Arquero(String nombre, int nivel, int puntosDeVida, String armaEspecial, int precision) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "Arquero{" +
                "precision=" + precision +
                '}';
    }


}


