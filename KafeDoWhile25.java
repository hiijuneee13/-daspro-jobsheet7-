import java.util.Scanner;

public class KafeDoWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaKopi = 12000;
        final int hargaTeh = 7000;
        final int hargaRoti = 20000;

        String namaPelanggan;
        int kopi, teh, roti;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            // input jumlah item (validasi integer >= 0)
            System.out.print("Jumlah kopi:");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah roti:");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar Rp " + totalHarga);
            System.out.println();

            // sc.nextLine() tidak diperlukan di sini karena bacaJumlah sudah menangani newline.
        } while (true);

        sc.close();
    }
}

    
