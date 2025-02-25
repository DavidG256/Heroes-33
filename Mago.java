public class Mago extends Heroe {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida, String armaEspecial, int mana) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "mana=" + mana +
                '}';
    }


}



