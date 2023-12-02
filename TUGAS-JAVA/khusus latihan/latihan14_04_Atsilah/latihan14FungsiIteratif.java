import java.util.Scanner;

/**
 * latihan14FungsiIteratif
 */
public class latihan14FungsiIteratif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        int totalNilai = Iteratif(nilai);

        System.out.println("Nilai Anda Adalah: " + totalNilai);
    }

    private static int Iteratif(int nilai){
        int total = 0;
        for (int i = 0; i <= nilai; i++) {
            total += i;

        }
        return total;
    }
}