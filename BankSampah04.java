import java.util.Scanner;

public class BankSampah04 {

    static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);

        double[] setoran = new double[n];

        for (int i = 0; i < setoran.length; i++) {
            System.out.print("Masukkan berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }

        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\nData Setoran Nasabah:");

        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": "
                    + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;

        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }
        return indeksTerbesar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nasabah: ");
        int n = sc.nextInt();

        double[] setoran = inputSetoran(n);

        tampilSetoran(setoran);

        System.out.println("Saldo Setiap Nasabah:");

        for (int i = 0; i < setoran.length; i++) {
            double saldo = hitungSaldo(setoran[i], 3000);

            System.out.println("Nasabah ke-" + (i + 1)
                    + ": Rp " + saldo);
        }

        System.out.println("Total seluruh setoran: "
                + totalSetoran(setoran) + " kg");

        int indeks = nasabahTerbanyak(setoran);

        System.out.println("Nasabah dengan setoran terbesar: "
                + (indeks + 1) + " dengan berat setoran "+ setoran[indeks] + " kg");

        sc.close();
    }
}
