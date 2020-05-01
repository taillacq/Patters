package Strategy_v2;

public class Strategie {
    public static void main(String[] args) {
        Vehicule v1 = new VehiculeSport(new DeplacerRapide());
        Vehicule v2 = new VehiculeTourisme(new DeplacerModere());

        System.out.print("V1: ");
        v1.deplacer();
        System.out.print("V2: ");
        v2.deplacer();
        System.out.println();

        v1.setDep(new DeplacerModere());
        v2.setDep(new DeplacerRapide());

        System.out.print("V1: ");
        v1.deplacer();
        System.out.print("V2: ");
        v2.deplacer();
        System.out.println();
    }
}
