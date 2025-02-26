import java.util.Objects;

public class ArmaEspecial {
    private String nombre;
    private int daño;

    public ArmaEspecial(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public String toString() {
        return "ArmaEspecial{" +
                "daño=" + daño +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ArmaEspecial arma = (ArmaEspecial) obj;
        return daño == arma.daño && Objects.equals(nombre, arma.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, daño);
    }
}