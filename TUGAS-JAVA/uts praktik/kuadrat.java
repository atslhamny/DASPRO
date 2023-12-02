import java.util.Scanner;

public class kuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input bilangan bulat N dari pengguna
        System.out.print("Masukkan sebuah bilangan bulat N (N > 0): ");
        int N = scanner.nextInt();
        
        // Memastikan N > 0
        if (N <= 0) {
            System.out.println("N harus lebih dari 0.");
        } else {
            int sum = 0;
            
            // Menghitung penjumlahan N bilangan kuadrat pertama
            for (int i = 1; i <= N; i++) {
                int kuadrat = i * i;
                sum += kuadrat;
            }
            
            // Menampilkan hasil penjumlahan bilangan kuadrat
            System.out.println("Penjumlahan N bilangan kuadrat pertama adalah: " + sum);
        }
        
        scanner.close();
    }
}
