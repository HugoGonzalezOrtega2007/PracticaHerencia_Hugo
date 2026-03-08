package GESTIONEMPLEADOS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Programador programador = new Programador("Dano", "Lopez Orto", 2000, "Web Developer", "Java", 20, 5);
        Gerente gerente = new Gerente("Raul", "Manzano Olivera", 6000, "Project Leader", 100, 200, 0);
        Programador programador1 = new Programador("Sergio", "Rocco Sasa", 2000, "Web Developer", "C++", 10, 2);
        Gerente gerente1 = new Gerente("Teodoro", "Rivera Rivera", 6000, "Project Leader", 50, 150, 0);

        System.out.println(programador);
        System.out.println(gerente);
        System.out.println(programador1);
        System.out.println(gerente1);
    }
}
