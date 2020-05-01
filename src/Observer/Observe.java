package Observer;

public class Observe {
    protected Observateur[] obs = new Observateur[9];
    private int count = 0;

    public void ajoute(Observateur o){
            obs[count] = o;
            count++;
    }

    public void notifier(){
        for (int i = 0; i<count; ++i)
            obs[i].update();
    }
}
