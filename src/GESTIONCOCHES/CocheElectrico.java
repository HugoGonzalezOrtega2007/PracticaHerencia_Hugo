package GESTIONCOCHES;

public class CocheElectrico extends Coche {
    private int anatomia;
    private int tiempoCarga;

    public CocheElectrico(String marca, String modelo, int precio, int velocidadMax, Rueda[] ruedas, int anatomia, int tiempoCarga) {
        super(marca, modelo, precio, velocidadMax, ruedas);
        this.anatomia = anatomia;
        this.tiempoCarga = tiempoCarga;
    }

    public int getAnatomia() {
        return anatomia;
    }

    public void setAnatomia(int anatomia) {
        this.anatomia = anatomia;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }
}
