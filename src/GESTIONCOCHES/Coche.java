package GESTIONCOCHES;

public class Coche {
    private String marca;
    private String modelo;
    private int precio;
    private int velocidadMax;
    private Rueda[] ruedas;

    public Coche(String marca, String modelo, int precio, int velocidadMax, Rueda[] ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidadMax = velocidadMax;
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                " | Modelo: " + modelo + " | Precio: " + precio + " | Velocidad maxima: " + velocidadMax + "\n" +
                "Rueda 1 -- Estado: " + ruedas[0].getEstado() + " -- Desgaste: " + ruedas[0].getDesgaste() + "\n" +
                "Rueda 2 -- Estado: " + ruedas[1].getEstado() + " -- Desgaste: " + ruedas[1].getDesgaste() + "\n" +
                "Rueda 3 -- Estado: " + ruedas[2].getEstado() + " -- Desgaste: " + ruedas[2].getDesgaste() + "\n" +
                "Rueda 4 -- Estado: " + ruedas[3].getEstado() + " -- Desgaste: " + ruedas[3].getDesgaste();
    }
}
