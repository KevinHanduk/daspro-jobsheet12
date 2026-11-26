import java.util.Scanner;
public class Kafe04 {

        public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
            int diskon = 0;
            if (isMember) {
                diskon += (int) (total * 0.1);
            }
            if (kodePromo.equals("DISKON50")) {
                return (int) (total * 0.5);
            } else if (kodePromo.equals("DISKON30")) {
                return (int) (total * 0.3);
            } else {
                System.out.println("Kode promo tidak valid.");
            }
            return diskon;
        }
        public static int hitungTotalHarga04(int pilihanMenu, int banyakItem) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
            return hargaTotal;
        }

        public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        int total = 0;
        String kodePromo = "";
        boolean isMember = true;

        do{
            System.out.print("Masukkan nomor menu (0 untuk keluar): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (pilihanMenu < 0 || pilihanMenu > 6) {
                System.out.println("Pilihan menu tidak valid. Silakan pilih menu antara 1 hingga 6. (0 untuk keluar)");
                continue;
            }

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga04(pilihanMenu, banyakItem);
            System.out.println("Total harga: Rp " + totalHarga);

            total += totalHarga;

        } while (true);
            System.out.println("Total keseluruhan pesanan: Rp " + total);
            System.out.print("Masukkan kode promo (jika ada): ");
            kodePromo = sc.next();
            int diskon = hitungDiskon(total, kodePromo, isMember);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total yang harus dibayar: Rp " + (total - diskon));
        sc.close();
    }
}