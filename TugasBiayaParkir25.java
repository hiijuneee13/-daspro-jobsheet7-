import java.util.Scanner;

public class TugasBiayaParkir25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tarifMobilPerJam = 3000;
        final int tarifMotorPerJam = 2000;
        final int tarifMaks = 12500;

        long totalPendapatan = 0;
        int totalKendaraan = 0;

        System.out.println("Program Parkir");
        System.out.println("Pilih jenis: 1=Mobil, 2=Motor, 0=Keluar");

        while (true) {
            System.out.print("Pilihan (1=Mobil,2=Motor,0=Keluar): ");
            while (!sc.hasNextInt()) {
                System.out.print("Input tidak valid. Masukkan 0,1,atau2: ");
                sc.next();
            }
            int jenis = sc.nextInt();
            if (jenis == 0) break;
            if (jenis != 1 && jenis != 2) {
                System.out.println("Pilihan tidak valid, silahkan coba lagi.");
                continue;
            }

            System.out.print("Durasi parkir (jam): ");
            while (!sc.hasNextInt()) {
                System.out.print("Input tidak valid. Masukkan jam dengan benar: ");
                sc.next();
            }
            int jam = sc.nextInt();
            if (jam < 0) {
                System.out.println("Durasi parkir tidak boleh negatif. Abaikan transaksi.");
                continue;
            }

            int bayar;
            if (jam >= 5) {
                bayar = tarifMaks;
            } else {
                bayar = (jenis == 1) ? jam * tarifMobilPerJam : jam * tarifMotorPerJam;
            }

            System.out.println("Bayar = Rp " + bayar);
            totalPendapatan += bayar;
            totalKendaraan++;
        }

        System.out.println("\nTotal kendaraan diproses: " + totalKendaraan);
        System.out.println("Total pendapatan parkir: Rp " + totalPendapatan);
        sc.close();
    }
}
