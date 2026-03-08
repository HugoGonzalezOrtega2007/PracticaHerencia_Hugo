package GESTIONCOCHES;

public class Rueda {
    private int desgaste;
    private String estado;

    public Rueda(int desgaste, String estado) {
        this.desgaste = desgaste;
        this.estado = estado;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
