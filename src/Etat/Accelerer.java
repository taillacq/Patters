package Etat;

public class Accelerer implements EtatMoteur {
    protected Moteur moteur;

    public Accelerer(Moteur mot){
        this.moteur = mot;
    }

    @Override
    public void demarrer() {
        System.out.println("Impossible de demarrer un moteur en acceleration");
    }

    @Override
    public void arreter() {
        System.out.println("Impossible d'arreter un moteur en acceleration");
    }

    @Override
    public void accelerer() {
        System.out.println("Le moteur est deja accelere");
    }

    @Override
    public void lacher() {
        System.out.println("L'acceleration est relachee");
        this.moteur.etat = new Lacher(this.moteur);
    }
}
