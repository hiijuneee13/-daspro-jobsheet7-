import java.util.Scanner;

public class SiakadWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        int jml;
        int i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // validasi
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Silakan masukkan nilai yang valid!");
                // continue -> i++ dilewatkan sehingga mahasiswa ini masih harus diinput ulang
                continue;
            }

            // penentuan kategori
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 58 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 58) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }


            // update penghitung mahasiswa yang sudah berhasil diinput
            i++;
        }

        System.out.println("Selesai input " + jml + " mahasiswa.");
        sc.close();
    }
}
