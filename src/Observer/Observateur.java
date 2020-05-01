package Observer;

abstract class Observateur {
    protected ObserveConcret sujet;
    public abstract void update();
}
