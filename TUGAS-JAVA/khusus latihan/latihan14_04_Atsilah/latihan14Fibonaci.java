import java.util.Scanner;

/**
 * latihan14Fibonaci
 */
public class latihan14Fibonaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Keseluruhan Nilai : ");
        int Fibonacci = sc.nextInt();

        System.out.print("Deret Fibonacci: ");

        for (int i = 0; i < Fibonacci; i++) {
            int AngkaFibonacci = HitungFibonacci(i);

            System.out.print(AngkaFibonacci + " , ");
        }
    }
    private static int HitungFibonacci(int nilai){
        if (nilai == 0 || nilai == 1) {
            return (1);
        }else{
            return HitungFibonacci(nilai - 1) + HitungFibonacci(nilai - 2);
        }
    }
}