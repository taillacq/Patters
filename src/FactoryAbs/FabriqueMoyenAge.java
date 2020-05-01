package FactoryAbs;

public class FabriqueMoyenAge implements FabriqueAbs {
    Soldat soldat;
    Officier officier;

    public FabriqueMoyenAge(){
        soldat = new Arbaletier();
        officier = new Senechal();
    }

    @Override
    public void creerSoldat(Soldat sol) {
        System.out.println("Un arbaletier du moyen age a ete cree");
        this.soldat = sol;
    }

    @Override
    public void creerOfficier(Officier off) {
        System.out.println("Un senechal du moyen age a ete cree");
        this.officier = off;
    }
}
