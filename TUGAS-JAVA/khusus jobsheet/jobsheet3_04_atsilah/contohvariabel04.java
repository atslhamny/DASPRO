/**
 * contohvariabel04
 */

import java.util.Scanner;
public class contohvariabel04 {

    public static void main(String[] args) {   
        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
        
    }

    static void Method1 (){
        String hobi = "Suka Ngoding";
        boolean isPandai = true;
        char Jenkel = 'P';
        byte umur = 18;
        double $ipk = 4, tinggi = 159;
        System.out.println(hobi);
        System.out.println("Apakah Pandai" + isPandai);
        System.out.println("Jenis Kelamin " + Jenkel);
        System.out.println("Umurku Saat ini " + umur);
        System.out.println(String.format("Saya berIPK %s, dengan tinggi badan %s", $ipk, tinggi)); 
       
    }

    static void Method2 (){
        char golDar = 'O';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 5000;
        float suhu = 34.00F;
        double berat = 0.700000;
        long saldo = 1000000000;
        int angkaDesimal = 0x12;

        System.out.println("Golongan Darah\t\t\t\t\t: " +  (byte) golDar);
        System.out.println("Jarak\t\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah Penduduk dalam Satu Dusun\t:" + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu\t\t\t\t\t\t:" + suhu);
        System.out.println("Berat\t\t\t\t\t\t\t:" +(float) berat);
        System.out.println("Saldo\t\t\t\t\t\t:" + saldo);
        System.out.println("Angka Desimal\t\t\t\t\t\t:" + angkaDesimal);
    }

    static void Method3(){
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x" + ++x);
        System.out.println("Setelah Evaluasi, x = " + x);
        int y =  12;
        System.out.println(x > y|| y == x && y <= x);
        int z = x ^ y;
        System.out.println("Hasil dari x ^ y adalah " + z);
        z %= 2;
        System.out.println("Hasil akhir" + z);
    }

    static void Method4(){
        Scanner input = new Scanner(System.in);

        int alas;
        int tinggi;
        float luas;

        System.out.println("Masukkan Alas");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi");
        tinggi = input.nextInt();

        luas = alas * tinggi /2;
        System.out.println("Luas Segitiga" + luas);
    }

    static void Method5(){
        Scanner input = new Scanner(System.in);

        int tbawal;
        int lmtbg;
        double jmltbak;
        double bunga;
        double prstsbg = 0.02;

        System.out.println("Masukkan Jumlah tabungan awal anda");
        tbawal = input.nextInt();
        System.out.println("Masukkan Lama menabung anda");
        lmtbg = input.nextInt();

        bunga = lmtbg*prstsbg*tbawal;
        jmltbak = bunga+tbawal;

        System.out.println("Jumlah Tabungan akhir anda adalah" +jmltbak);
    }


}