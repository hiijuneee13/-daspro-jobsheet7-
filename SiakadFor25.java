import java.util.Scanner;

public class SiakadFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai;
        double tertinggi = 0.0;
        double terendah = 100.0;
        int lulus = 0;
        int tidakLulus = 0;

        System.out.println("Masukkan nilai 10 mahasiswa (0-100):");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // cek tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // cek terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // hitung lulus / tidak lulus (batas lulus >= 60)
            if (nilai >= 60) lulus++;
            else tidakLulus++;
        }

        System.out.println("\nHasil:");
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah  = " + terendah);
        System.out.println("Jumlah mahasiswa lulus     = " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = " + tidakLulus);

        sc.close(); 
    }
}
