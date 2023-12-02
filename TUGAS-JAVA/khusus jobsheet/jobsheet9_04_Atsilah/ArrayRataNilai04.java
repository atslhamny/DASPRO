import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] mahasiswa = new int[jumlahMahasiswa];

        
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

        }
        for (int i = 0; i < mahasiswa.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        // System.out.println("Rata Rata Nilai = " + rata2);
        if (rata2 > 70) {
            System.out.println("Rata Rata Nilai Lulus = " + rata2);
            
        }
        else{
            System.out.println("Rata Rata Nilai Tidak Lulus = " + rata2);
        }
    }
}
