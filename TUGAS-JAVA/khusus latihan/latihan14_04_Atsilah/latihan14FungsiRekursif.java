import java.util.Scanner;

/**
 * latihan14FungsiRekursif
 */
public class latihan14FungsiRekursif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        int totalNilai = Rekursif(nilai);

        System.out.println("Nilai Anda Adalah " + totalNilai);
    }

    private static int Rekursif(int nilai){
        if (nilai == 1){
            return (1);

        }else{
            return nilai + Rekursif(nilai-1);
        }
    }
}