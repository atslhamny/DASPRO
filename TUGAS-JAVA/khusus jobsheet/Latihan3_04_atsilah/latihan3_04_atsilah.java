import java.util.Scanner;
public class latihan3_04_atsilah {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.println("Masukkan Panjang");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar");
        lebar = input.nextInt();

        keliling = 2*(panjang + lebar);

        System.out.println("Hasil Keliling");
        System.out.println(keliling);

    }
}