package Observer;

public class ObservateurBinaire extends Observateur {
    protected ObserveConcret sujet;

    public ObservateurBinaire(ObserveConcret s){
        this.sujet = s;
        sujet.ajoute(this);
    }

    @Override
    public void update() {
        System.out.println(" "+ Integer.toBinaryString(sujet.getEtat()));
    }
}
