package Etat;

public class Demarrer implements EtatMoteur{
    protected Moteur moteur;
    public Demarrer(Moteur mot){
        this.moteur = mot;
    }
    @java.lang.Override
    public void demarrer() {
        System.out.println("Le moteur est deja en marche");
    }

    @java.lang.Override
    public void arreter() {
        System.out.println("Le moteur se met a l'arret");
        this.moteur.etat = new Arrete(this.moteur);
    }

    @java.lang.Override
    public void accelerer() {
        System.out.println("Le moteur est accelere");
        this.moteur.etat = new Accelerer(this.moteur);
    }

    @java.lang.Override
    public void lacher() {
        System.out.println("Impossible de lacher un moteur qui n'est pas accelere");
    }
}
