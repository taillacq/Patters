package Strategy_v2;

abstract class Vehicule {
    protected Deplacer dep;

    public Vehicule(Deplacer algo){
        this.dep = algo;
    }
    public void setDep(Deplacer algo){
        this.dep = algo;
    }
    public void deplacer(){
        dep.deplacer();
    }
}
