package Observer;

public class ObservateurOctal extends Observateur {
    protected ObserveConcret sujet;

    public ObservateurOctal(ObserveConcret s){
        this.sujet = s;
        sujet.ajoute(this);
    }

    @Override
    public void update() {
        System.out.println(" "+ Integer.toOctalString(sujet.getEtat()));
    }
}
