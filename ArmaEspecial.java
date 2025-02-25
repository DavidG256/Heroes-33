public class ArmaEspecial extends Heroe {
    protected String nombreArma;
    protected int dañoArma;


    public ArmaEspecial(String nombre, int nivel, int puntosDeVida, String armaEspecial, String nombreArma, int dañoArma) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.nombreArma = nombreArma;
        this.dañoArma = dañoArma;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public int getDañoArma() {
        return dañoArma;
    }

    @Override
    public String toString() {
        return "ArmaEspecial{" +
                "nombreArma='" + nombreArma + '\'' +
                ", dañoArma=" + dañoArma +
                '}';
    }

}
