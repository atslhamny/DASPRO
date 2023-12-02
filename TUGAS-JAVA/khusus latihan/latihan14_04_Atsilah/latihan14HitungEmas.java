import java.util.Scanner;

public class latihan14HitungEmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah tahun
        System.out.print("Masukkan jumlah tahun: ");
        int N = scanner.nextInt();

        // Input jumlah uang yang diinvestasikan awalnya
        System.out.print("Masukkan jumlah uang awal: ");
        double initialInvestment = scanner.nextDouble();

        // Hitung hasil investasi
        double finalAmount = calculateInvestment(initialInvestment, N);

        // Cetak hasil investasi
        System.out.println("Total uang setelah " + N + " tahun: $" + finalAmount);
    }

    private static double calculateInvestment(double initialInvestment, int years) {
        // Tingkat keuntungan per tahun
        double annualRate = 0.117; // 11,7%

        // Menghitung hasil investasi secara iteratif
        double finalAmount = initialInvestment;
        for (int i = 0; i < years; i++) {
            finalAmount += finalAmount * annualRate;
        }

        return finalAmount;
    }
}
