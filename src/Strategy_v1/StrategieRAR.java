package Strategy_v1;

import java.io.File;
import java.util.ArrayList;

public class StrategieRAR implements Strategie {
    @Override
    public void compresser(ArrayList<File> files) {
        for (File f :
                files) {
            System.out.println("Compresse avec RAR" + f.getName());
        }
    }
}
