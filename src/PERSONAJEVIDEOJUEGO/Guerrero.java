package PERSONAJEVIDEOJUEGO;

import java.util.Random;
import java.util.Scanner;

public class Guerrero extends Personaje {
    private int fuerza;
    private String armadura;

    public Guerrero(String nombre, int vida, int ataque, int defensa, String armadura, int fuerza) {
        super(nombre, vida, ataque, defensa);
        this.armadura = armadura;
        this.fuerza = fuerza;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Estadísticas de " + getNombre() + " -- Vida: " + getVida() + " | Ataque: " + getAtaque() + " | Defensa: " + getDefensa()
                + " | Fuerza: " + fuerza + " | Armadura: " + armadura;
    }

    //ATAQUE DEL GUERRERO
    public void ataqueGuerrero(Mago mago) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        boolean volver = true;
        while (volver) {

            System.out.print("¿Que acción desea realizar " + getNombre() + "? (1. Ataque | 2. Ataque con fuerza | 3. Ganar fuerza [+10]) ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                int esquivo = rand.nextInt(10) + 1;
                if (esquivo != 3) {
                    System.out.println(getNombre() + " ha hecho " + getAtaque() + " de daño.");
                    mago.setVida(mago.getVida() - getAtaque());

                    if (mago.getVida()<=0) {
                        System.out.println(getNombre() + " ha ganado el combate.");
                        System.exit(0);
                    }

                } else {
                    System.out.println(mago.getNombre() + "ha esquivado el ataque");
                }

                volver = false;

            } else if (opcion == 2) {
                if (getFuerza() < 30) {
                    System.out.println(getNombre() + " no tiene suficiente fuerza. No puede realizar un ataque con fuerza.");
                    volver = true;

                } else {
                    int ataqueFuerza = getAtaque() + getFuerza();
                    System.out.println(getNombre() + " ha realizado un ataque con fuerza y ha hecho " + ataqueFuerza + " de daño.");
                    mago.setVida(mago.getVida() - ataqueFuerza);

                    if (mago.getVida()<=0) {
                        System.out.println(getNombre() + " ha ganado el combate.");
                        System.exit(0);
                    }

                    setFuerza(getFuerza() - 30);
                    volver = false;
                }
            } else if (opcion == 3) {
                setFuerza(getFuerza()+10);
                volver = false;
            }
        }
    }
}

