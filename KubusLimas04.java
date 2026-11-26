
import java.util.Scanner;

public class KubusLimas04 {

    static int luasPersegi(int s) {
        return s * s;
    }

    static int volumeKubus(int s) {
        return s * s * s;
    }

    static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    static double volumeLimasPersegi(int s, int t) {
        return (double) luasPersegi(s) * t / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan panjang sisi: ");
                int s = sc.nextInt();

                System.out.println("Volume kubus: " + volumeKubus(s));

            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang sisi: ");
                int s = sc.nextInt();

                System.out.println("Luas permukaan kubus: "
                        + luasPermukaanKubus(s));

            } else if (pilihan == 3) {
                System.out.print("Masukkan panjang sisi alas: ");
                int s = sc.nextInt();

                System.out.print("Masukkan tinggi limas: ");
                int t = sc.nextInt();

                System.out.println("Volume limas: "
                        + volumeLimasPersegi(s, t));

            } else if (pilihan == 0) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak tersedia.");
                continue;
            }

        } while (true);

        sc.close();
    }
}
