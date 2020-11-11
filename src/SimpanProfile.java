import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SimpanProfile {
    public void simpanProfil(Profile profile) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("flatdata.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(profile);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
