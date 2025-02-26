import java.util.ArrayList;
import java.util.List;

public abstract class Heroe {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;
    protected List<ArmaEspecial> armas;

    public Heroe(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.armas = new ArrayList<>();
    }

    public void agregarArma(ArmaEspecial arma) {
        if (!armas.contains(arma)) {
            armas.add(arma);
        }
    }

    public void listarArmas() {
        System.out.println("Armas de " + nombre + ": " + armas);
    }

    public abstract void atacar();

    @Override
    public String toString() {
        return nombre + " (Nivel: " + nivel + ", PV: " + puntosDeVida + ") - Armas: " + armas;
    }
}
