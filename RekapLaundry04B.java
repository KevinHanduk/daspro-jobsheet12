import java.util.Scanner;

public class RekapLaundry04B {

    static void tampilData(String[] nama, int[] harga, int[][] data) {
        System.out.println("\n===== REKAP BERAT CUCIAN =====");

        System.out.printf("%-18s", "Layanan");

        for (int j = 0; j < data[0].length; j++) {
            System.out.printf("%-12s", "Hari ke-" + (j + 1));
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-18s", nama[i]);

            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-12d", data[i][j]);
            }

            System.out.println();
        }
    }
    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;

        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }

        return total;
    }
    static int hariTersibuk(int[][] data) {
        int indeksTerbesar = 0;

        for (int j = 1; j < data[0].length; j++) {
            int totalHari = 0;
            int totalTerbesar = 0;

            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
                totalTerbesar += data[i][indeksTerbesar];
            }

            if (totalHari > totalTerbesar) {
                indeksTerbesar = j;
            }
        }
        return indeksTerbesar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah layanan: ");
        int jumlahLayanan = sc.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        sc.nextLine();

        String[] nama = new String[jumlahLayanan];
        int[] harga = new int[jumlahLayanan];
        int[][] data = new int[jumlahLayanan][jumlahHari];

        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.println("\nLayanan ke-" + (i + 1));

            System.out.print("Masukkan nama layanan: ");
            nama[i] = sc.nextLine();

            System.out.print("Masukkan harga per kg: ");
            harga[i] = sc.nextInt();

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Berat cucian hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }
        tampilData(nama, harga, data);

        int totalPendapatan = 0;
        int indeksTerbesar = 0;

        System.out.println("\nTotal berat setiap layanan:");

        for (int i = 0; i < jumlahLayanan; i++) {
            int total = totalPerLayanan(data, i);

            System.out.println(nama[i] + ": " + total + " kg");

            totalPendapatan += total * harga[i];

            if (total > totalPerLayanan(data, indeksTerbesar)) {
                indeksTerbesar = i;
            }
        }
        System.out.println("\nLayanan dengan berat tertinggi: "
                + nama[indeksTerbesar]);
        System.out.println("Hari tersibuk: Hari ke-"
                + (hariTersibuk(data) + 1));
        System.out.println("\nPendapatan setiap layanan:");

        for (int i = 0; i < jumlahLayanan; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];

            System.out.println(nama[i] + ": Rp " + pendapatan);
        }
        System.out.println("Total pendapatan: Rp " + totalPendapatan);

        sc.close();
    }
}
