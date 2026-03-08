package PERSONAJEVIDEOJUEGO;

import java.util.Random;
import java.util.Scanner;

public class Mago extends Personaje {
    private int mana;
    private int poderMagico;

    public Mago(String nombre, int vida, int ataque, int defensa, int mana, int poderMagico) {
        super(nombre, vida, ataque, defensa);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public String toString() {
        return "Estadísticas de " + getNombre() + " -- Vida: " + getVida() + " | Ataque: " + getAtaque() + " | Defensa: " + getDefensa()
                + " | Maná: " + mana + " | Poder mágico: " + poderMagico;
    }

    //ATAQUE DEL MAGO
    public void ataqueMago(Guerrero guerrero) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        boolean volver = true;
        while (volver) {

            System.out.print("¿Que acción desea realizar " + getNombre() + "? (1. Ataque | 2. Ataque magico | 3. Ganar poder mágico [+10]) ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                int esquivo = rand.nextInt(10) + 1;
                if (esquivo != 3) {
                    System.out.println(getNombre() + " ha hecho " + getAtaque() + " de daño.");
                    guerrero.setVida(guerrero.getVida() - getAtaque());

                    if (guerrero.getVida()<=0) {
                        System.out.println(getNombre() + " ha ganado el combate.");
                        System.exit(0);
                    }

                } else {
                    System.out.println(guerrero.getNombre() + " ha esquivado el ataque");
                }

                volver = false;

            } else if (opcion == 2) {
                if (getPoderMagico() < 30) {
                    System.out.println(getNombre() + " no tiene suficiente poder mágico. No puede realizar un ataque mágico.");
                    volver = true;

                } else {
                    int ataqueMagico = getAtaque() + getPoderMagico();
                    System.out.println(getNombre() + " ha realizado un ataque magico y ha hecho " + ataqueMagico + " de daño.");
                    guerrero.setVida(guerrero.getVida() - ataqueMagico);

                    if (guerrero.getVida()<=0) {
                        System.out.println(getNombre() + " ha ganado el combate");
                        System.exit(0);
                    }
                    setMana(getMana() - 30);
                    if (getMana()<0)
                        mana=0;
                    setPoderMagico(getPoderMagico() - 20);
                    volver = false;

                }
            } else if (opcion == 3) {
                setPoderMagico(getPoderMagico()+10);
                volver = false;
            }
        }
    }
}

