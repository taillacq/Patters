package Observer;

public class ObservateurHexagecimal extends Observateur{
    protected ObserveConcret sujet;

    public ObservateurHexagecimal(ObserveConcret s){
        this.sujet = s;
        sujet.ajoute(this);
    }

    public void update() {
        System.out.println(" "+ Integer.toHexString(sujet.getEtat()));
    }
}
