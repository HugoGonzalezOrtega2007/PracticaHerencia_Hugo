package GESTIONCOCHES;

public class Main {
    public static void main(String[] args) {

        Rueda[] ruedas = new Rueda[4];

        ruedas[0] = new Rueda(15, "Bueno");
        ruedas[1] = new Rueda(40, "Medio");
        ruedas[2] = new Rueda(5, "Nuevo");
        ruedas[3] = new Rueda(70, "Gastado");

        Coche coche = new Coche("BMW", "M3", 80000, 280, ruedas);

        System.out.println(coche);

        Rueda[] ruedas1 = new Rueda[4];

        ruedas1[0] = new Rueda(35, "Medio");
        ruedas1[1] = new Rueda(45, "Medio");
        ruedas1[2] = new Rueda(85, "Gastado");
        ruedas1[3] = new Rueda(10, "Nuevo");

        Coche coche1 = new Coche("Opel", "Corsa", 50000, 200, ruedas1);

        System.out.println("-------------------------------------------------------------------");

        System.out.println(coche1);
    }
}
