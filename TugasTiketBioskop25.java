import java.util.Scanner;

public class TugasTiketBioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiket = 0;
        long totalPendapatan = 0;

        System.out.println("Masukkan jumlah tiket yang dibeli setiap pelanggan.");
        System.out.println("Masukkan 0 untuk selesai (akhiri hari).");

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            while (!sc.hasNextInt()) {
                System.out.print("Input tidak valid! Masukkan angka yang benar: ");
                sc.next();
            }
            int jml = sc.nextInt();

            if (jml < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Coba lagi.");
                continue;
            }
            if (jml == 0) break;

            double diskon = 0.0;
            if (jml > 10) diskon = 0.15;
            else if (jml > 4) diskon = 0.10;

            long totalHarga = Math.round(jml * hargaTiket * (1.0 - diskon));
            System.out.println("Total bayar untuk " + jml + " tiket = Rp " + totalHarga + " (diskon " + (int)(diskon*100) + "%)");

            totalTiket += jml;
            totalPendapatan += totalHarga;
        }

        System.out.println("\nRekap hari ini:");
        System.out.println("Total tiket terjual = " + totalTiket);
        System.out.println("Total pendapatan    = Rp " + totalPendapatan);

        sc.close();
    }
}
