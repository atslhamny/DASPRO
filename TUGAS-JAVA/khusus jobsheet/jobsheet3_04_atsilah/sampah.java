import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 1) {
            // Jika n adalah bilangan ganjil
            System.out.println("Weird");
        } else {
            // Jika n adalah bilangan genap
            if (n >= 2 && n <= 5) {
                // Jika n adalah bilangan genap dalam rentang 2 hingga 5
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                // Jika n adalah bilangan genap dalam rentang 6 hingga 20
                System.out.println("Weird");
            } else {
                // Jika n adalah bilangan genap lebih dari 20
                System.out.println("Not Weird");
            }
        }
    }
}