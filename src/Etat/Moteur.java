package Etat;

public class Moteur {

    protected EtatMoteur etat;

    public Moteur(){
        etat = new Arrete(this);
    }
    public void demarrer(){
        etat.demarrer();
    }
    public void accelerer(){
        etat.accelerer();
    }
    public void lacher(){
        etat.lacher();
    }
    public void arreter(){
        etat.arreter();
    }
}
