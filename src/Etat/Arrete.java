package Etat;

public class Arrete implements EtatMoteur {
    protected Moteur moteur;
    public Arrete (Moteur mot){
        this.moteur = mot;
    }

    @java.lang.Override
    public void demarrer() {
        System.out.println("Mise en marche du moteur");
        this.moteur.etat = new Demarrer(this.moteur);
    }

    @java.lang.Override
    public void arreter() {
        System.out.println("Le moteur est deja a l'arret");
    }

    @java.lang.Override
    public void accelerer() {
        System.out.println("Impossible d'accelerer, moteur a l'arret");
    }

    @java.lang.Override
    public void lacher() {
        System.out.println("Impossible de lacher, le moteur est deja a l'arret");
    }
}
