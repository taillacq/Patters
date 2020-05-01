package FactoryAbs;

public class FabriqueRome implements FabriqueAbs {
    Soldat soldat;
    Officier officier;

    public FabriqueRome(){
        soldat = new Legionnaire();
        officier = new Centurion();
    }
    @Override
    public void creerSoldat(Soldat sol) {
        System.out.println("Un legionnaire romain a ete cree");
        this.soldat = sol;
    }

    @Override
    public void creerOfficier(Officier off) {
        System.out.println("Un centurion romain a ete cree");
        this.officier = off;
    }
}
