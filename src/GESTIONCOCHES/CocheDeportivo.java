package GESTIONCOCHES;

public class CocheDeportivo extends Coche {
    private int caballos;
    private String modoCarrera;

    public CocheDeportivo(String marca, String modelo, int precio, int velocidadMax, Rueda[] ruedas, int caballos, String modoCarrera) {
        super(marca, modelo, precio, velocidadMax, ruedas);
        this.caballos = caballos;
        this.modoCarrera = modoCarrera;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getModoCarrera() {
        return modoCarrera;
    }

    public void setModoCarrera(String modoCarrera) {
        this.modoCarrera = modoCarrera;
    }
}
