package Observer;

public class ObserveConcret extends Observe {
    int etat;

    public void setEtat(int e){
        this.etat = e;
        super.notifier();
    }
    public int getEtat() {return etat;}
}
