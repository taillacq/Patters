package Strategy_v1;

import java.io.File;
import java.util.ArrayList;

public class Compresseur {
    Strategie str;
    ArrayList<File> files;

    public void setStrategie(Strategie s){
        this.str = s;
    }
    public void setFiles (ArrayList<File> f){
        this.files = f;
    }
    public void creerArchive(){
        str.compresser(files);
    }

    public static void main(String[] args) {
        Compresseur com = new Compresseur();
        Strategie rar = new StrategieRAR();
        com.setStrategie(rar);
        ArrayList<File> f = new ArrayList<File>();
        f.add(new File("truc.txt"));
        f.add(new File("bidule.txt"));
        com.setFiles(f);
        com.creerArchive();
        Strategie zip = new StrategieZIP();
        com.setStrategie(zip);
        com.creerArchive();
    }
}
