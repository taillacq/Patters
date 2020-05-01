package Observer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nomb;
        ObserveConcret obs = new ObserveConcret();

        new ObservateurHexagecimal(obs);
        new ObservateurOctal(obs);
        new ObservateurBinaire(obs);

        while (true){
            System.out.print("Entrez un entier");
            nomb = sc.nextInt();
            obs.setEtat(nomb);
        }

    }
}
