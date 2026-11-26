import java.util.Scanner;

public class LuasLingkaran04 {

    static double hitungLuasLingkaran(double r) {
        double phi = 3.14;
        double luas;

        luas = phi * r * r;

        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, hasil;

        System.out.print("Masukkan jari-jari lingkaran: ");
        r = sc.nextDouble();

        hasil = hitungLuasLingkaran(r);

        System.out.println("Luas lingkaran = " + hasil);

        sc.close();
    }
}