package Etat;

public class Lacher implements EtatMoteur {
    protected Moteur moteur;

    public Lacher(Moteur mot){
        this.moteur = mot;
    }
    @Override
    public void demarrer() {
        System.out.println("Le moteur est deja en marche");
    }

    @Override
    public void arreter() {
        System.out.println("Le moteur se me a l'arret");
        this.moteur.etat = new Arrete(this.moteur);
    }

    @Override
    public void accelerer() {
        System.out.println("Le moteur est accelere");
        this.moteur.etat = new Accelerer(this.moteur);
    }

    @Override
    public void lacher() {
        System.out.println("Le moteur est deja lache");
    }
}
