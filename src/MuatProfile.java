import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MuatProfile {
    public Profile muatProfil() {
        Profile profile = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("flatdata.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            profile = (Profile) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return profile;
    }
}
