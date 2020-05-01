package Etat;

public class Etat {
    public static void main(String[] args) {
        Moteur moteur = new Moteur();

        moteur.demarrer();
        moteur.accelerer();
        moteur.lacher();

        System.out.println(" ");

        moteur.arreter();
        moteur.arreter();
        moteur.accelerer();
        moteur.lacher();

        System.out.println(" ");

        moteur.demarrer();
        moteur.demarrer();
    }
}
