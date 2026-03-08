package PERSONAJEVIDEOJUEGO;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Guerrero guerrero = new Guerrero("Soliur", 50, 20, 30, "Hierro", 20);
        Mago mago = new Mago("Lopes", 50, 15, 20, 40, 5);

        int numero = 1;

        //MENÚ INCIAL
        boolean inicio = true;
        while (inicio) {
            System.out.println("INICIO DEL COMBATE");
            System.out.println("-- " + guerrero.getNombre() + " VS " + mago.getNombre() + " --");
            System.out.println("Se sorteará un numero del 1 - 10. Si sale par ataca primero " + guerrero.getNombre()
                    + ", sino empieza " + mago.getNombre());

            int sorteo = rand.nextInt(5) + 1;
            System.out.println("Ha salido el numero " + sorteo);

            //COMBATE
            while (mago.getVida()>0 && guerrero.getVida()>0) {

                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println(mago);
                System.out.println(guerrero);

                if (sorteo % 2 == 0) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    guerrero.ataqueGuerrero(mago);
                    mago.ataqueMago(guerrero);
                } else if (sorteo % 2 != 0){
                    System.out.println("--------------------------------------------------------------------------------------------");
                    mago.ataqueMago(guerrero);
                    guerrero.ataqueGuerrero(mago);
                }
            }
            break;

        }
        inicio = false;
    }
}
