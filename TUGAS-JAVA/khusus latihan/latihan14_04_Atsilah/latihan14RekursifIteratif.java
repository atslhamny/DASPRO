import java.util.Scanner;

public class latihan14RekursifIteratif {

    // Fungsi iteratif
    public static int hitungTotalIteratif(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }

    // Fungsi rekursif
    public static int hitungTotalRekursif(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N + hitungTotalRekursif(N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        // Hitung dan cetak total secara iteratif
        int totalIteratif = hitungTotalIteratif(N);
        System.out.println("Total secara iteratif: " + totalIteratif);

        // Hitung dan cetak total secara rekursif
        int totalRekursif = hitungTotalRekursif(N);
        System.out.println("Total secara rekursif: " + totalRekursif);

        scanner.close();
    }
}
