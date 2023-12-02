import java.util.Scanner;

public class dump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah elemen dari pengguna
        System.out.print("Masukkan jumlah elemen: ");
        int jumlahElemen = scanner.nextInt();

        // Membuat array untuk menyimpan nilai-nilai
        int[] nilai = new int[jumlahElemen];

        // Meminta pengguna untuk memasukkan nilai-nilai dalam array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        // Menghitung nilai tertinggi, nilai terendah, dan nilai rata-rata
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int total = nilai[0];

        for (int i = 1; i < jumlahElemen; i++) {
            total += nilai[i];

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlahElemen;

        // Menampilkan hasil
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Rata-rata Nilai: " + rataRata);
    }
}
