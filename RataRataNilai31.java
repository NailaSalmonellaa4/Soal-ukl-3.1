import java.util.Scanner;

public class RataRataNilai31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        // Ulangi untuk setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        // Tampilkan hasil
        System.out.println("Rata-rata nilai ujian Produktif RPL adalah: " + rataRata);

        input.close();
    }
}