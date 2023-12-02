import java.util.Scanner;

/**
 * copy
 */
public class segitiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sudut pertama: ");
        int sudut1 = scanner.nextInt();
        System.out.print("Masukkan sudut kedua: ");
        int sudut2 = scanner.nextInt();
        System.out.print("Masukkan sudut ketiga: ");
        int sudut3 = scanner.nextInt();

        if (sudut1 + sudut2 + sudut3 == 180) {
            if (sudut1 > 0 && sudut2 > 0 && sudut3 > 0 && sudut1 < 180 && sudut2 < 180 && sudut3 < 180) {
                if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                    System.out.println("Segitiga tersebut adalah segitiga SIKU-SIKU.");
                } else {
                    System.out.println("Segitiga tersebut BUKAN segitiga SIKU-SIKU.");
                }
            }else{
                System.out.println("Sudut harus lebih besar dari 0° dan kurang dari 180°.");
            }
        } else {
            System.out.println("Sudut Harus Sama dengan 180 derajat");
        }
    }
}