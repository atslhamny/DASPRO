import java.util.Scanner;

public class bilgan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input bilangan bulat N dari pengguna
        System.out.print("Masukkan sebuah bilangan bulat N (N > 0): ");
        int N = scanner.nextInt();
        
        // Memeriksa setiap digit dalam bilangan dan menghitung jumlah digit ganjil
        int jumlahDigitGanjil = 0;
        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                jumlahDigitGanjil++;
            }
            N = N / 10;
        }
        
        // Menampilkan jumlah digit ganjil
        System.out.println("Jumlah digit yang ganjil dalam bilangan tersebut adalah: " + jumlahDigitGanjil);
        
        scanner.close();
    }
}
