import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MuatProfile muatProfile = new MuatProfile();
        SimpanProfile simpanProfile = new SimpanProfile();
        Scanner input = new Scanner(System.in);
        int menu = 3;
        Profile profileSaya;

        do {
            System.out.println("Nama: Gde Agung Mandala Bendesa\nNim: 1908561105\n");
            if (muatProfile.muatProfil() != null) {
                profileSaya = muatProfile.muatProfil();

                System.out.println("Selamat datang kembali " + profileSaya.getUsername() + "!\nMenu: \n1. Lihat Data Diri\n2. Logout\n3. Keluar\n>");
                menu = input.nextInt();
                input.nextLine();

                switch (menu) {
                    case 1:
                        System.out.println("Username: " + profileSaya.getUsername() + "\nPassword: " + profileSaya.getPassword() + "\n");
                        break;
                    case 2:
                        simpanProfile.simpanProfil(null);
                        System.out.println("Logout berhasil\n");
                        break;
                    case 3:
                        break;
                }
            } else {
                System.out.println("Menu: \n1. Login\n2. Tentang Aplikasi Ini\n3. Keluar\n>");
                menu = input.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Username: ");
                        input.nextLine();
                        String username = input.nextLine();
                        System.out.println("Password: ");
                        String password = input.nextLine();

                        Profile profile = new Profile(username, password);
                        simpanProfile.simpanProfil(profile);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
            System.out.println("tekan apapun untuk melanjutkan\n");
            input.nextLine();
        } while(menu != 3);
    }
}
