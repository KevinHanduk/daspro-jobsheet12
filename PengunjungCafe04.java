
public class PengunjungCafe04 {
    public static int hitungTotalBelanja(int... harga) {
    int total = 0;

    for (int i = 0; i < harga.length; i++) {
        total += harga[i];
        }

    return total;
    }

    public static void main(String[] args) {
        int totalBelanja = hitungTotalBelanja(1, 3, 5);
        System.out.println("Total: " + totalBelanja);
    }
}
