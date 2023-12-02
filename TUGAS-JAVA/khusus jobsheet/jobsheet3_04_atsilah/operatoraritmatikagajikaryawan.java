import java.util.Scanner;
// import java.lang.reflect.Array;
// import java.util.Calendar;
public class operatoraritmatikagajikaryawan {
    public static void main(String[] args) {

        TotalGaji();
        GajiLembur();
        PotonganPajak();
        GajiBersih();
                
    }

    static void TotalGaji(){
        Scanner input = new Scanner(System.in);

        int upah; //upah perjam
        int jamKerja = 40;
        int gajiPokok;

        System.out.println("Masukkan Upah awal anda");
        upah = input.nextInt();

        gajiPokok = upah * jamKerja;

        System.out.println("Gaji Pokok anda adalah" + gajiPokok);
        
    }

    static void GajiLembur(){
        Scanner input = new Scanner(System.in);

        int upLembur;
        int jamLembur = 5;
        double gajiLembur;

        System.out.println("Masukkan Upah Lembur anda");
        upLembur = input.nextInt();

        gajiLembur = upLembur * jamLembur;

        System.out.println("Gaji Lembur anda adalah" + gajiLembur);
    }
    static void PotonganPajak(){
        Scanner input = new Scanner(System.in);

        int gajiawl;
        double tarifpjk = 0.20;
        int intergerValue = (int)tarifpjk;
        int potongan;

        System.out.println("Masukkan Gaji Awal anda");
        gajiawl = input.nextInt();
        
        potongan = gajiawl * intergerValue;

        System.out.println("Ini adalah pajak anda" + potongan);
    }
    static void GajiBersih(){
        Scanner input = new Scanner(System.in);
        int gPokok;
        int gLembur;
        int pjk;
        int gBersih;

        System.out.println("Masukkan Gaji Pokok anda");
        gPokok = input.nextInt();
        System.out.println("Masukkan Gaji Lembur anda");
        gLembur = input.nextInt();
        System.out.println("Masukkan Pajak anda");
        pjk = input.nextInt();

        gBersih = gPokok + gLembur + pjk;
        System.out.println("Gaji Bersih anda adalah" + gBersih);

    }
    

}
