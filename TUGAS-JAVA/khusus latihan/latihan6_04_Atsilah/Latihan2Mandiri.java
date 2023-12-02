import java.util.Scanner;

public class Latihan2Mandiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jenis buku (kamus, novel, atau lainnya): ");
        String jenisBuku = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = scanner.nextInt();
        
        double diskon = 0;
        
        if (jenisBuku.equals("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.1 + 0.02;
            } else {
                diskon = 0.1;
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.07 + 0.02;
            } else {
                diskon = 0.07 + 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }
        
        double totalDiskon = diskon * jumlahBuku;
        System.out.println("Total diskon yang harus dibayar: " + totalDiskon);
    }
}
