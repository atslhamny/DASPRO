import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== UTS DASAR PEMROGRAMAN SIB-IF===");
        System.out.println("Dibuat Oleh : Atsilah Amany P H");
        System.out.println("NIM : 2341760011 ");

        String namaKaryawan = "", alamatKaryawan = "", nomorHpKaryawan = "";
        int jumlahPenjualanSepeda = 0, masaKerja = 0, jumlahCuti = 0, tunjangan = 0, potonganCuti = 0;
        double totalGaji;



        while (true) {
            System.out.println("Pilih Menu:");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji Karyawan");
            System.out.print("menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:

                    System.out.println("Masukkan data karyawan");
                    System.out.print("Nama: ");
                    namaKaryawan = input.nextLine();
                    System.out.print("Alamat: ");
                    alamatKaryawan = input.nextLine();
                    System.out.print("NoHp: ");
                    nomorHpKaryawan = input.nextLine();
                    System.out.print("Masukkan Jumlah Penjualan Sepeda : ");
                    jumlahPenjualanSepeda = input.nextInt();
                    System.out.print("Masukkan Masa Kerja : ");
                    masaKerja = input.nextInt();
                    System.out.print("Masukkan Jumlah Cuti : ");
                    jumlahCuti = input.nextInt();

                    input.nextLine();
                    System.out.print("Apakah anda ingin mencetak data karyawan? (y/t) ");
                    String cetak = input.nextLine();

                    if (cetak.equalsIgnoreCase("y")) {
                        System.out.println("Data Karyawan");
                        System.out.println("Nama: " + namaKaryawan);
                        System.out.println("Alamat: " + alamatKaryawan);
                        System.out.println("NoHp: " + nomorHpKaryawan);
                        System.out.println("Jumlah Penjualan Sepeda :" + jumlahPenjualanSepeda);
                        System.out.println("Masa Kerja :" + masaKerja);
                        System.out.println("Jumlah Cuti :" + jumlahCuti);
                    } else if (cetak.equalsIgnoreCase("t")) {
                        break;
                    }
                    break;
                case 2:

                if (namaKaryawan.isEmpty()) {
                    System.out.println("Silahkan Masukkan Data Karyawannya lagi");
                }
                    int hargaSepeda = 1500000;
                    double komisi = 0;
                    if (jumlahPenjualanSepeda <= 3000000) {
                        komisi = 0.02 * jumlahPenjualanSepeda;
                    } else if (jumlahPenjualanSepeda > 3000000 && jumlahPenjualanSepeda <= 5000000) {
                        komisi = 0.05 * jumlahPenjualanSepeda;
                    } else if (jumlahPenjualanSepeda > 5000000 && jumlahPenjualanSepeda <= 10000000) {
                        komisi = 0.07 * jumlahPenjualanSepeda;
                    } else {
                        komisi = 0.15 * jumlahPenjualanSepeda;
                    }

                    tunjangan = 0;
                    if (masaKerja >= 3 && masaKerja <= 5) {
                        tunjangan = 1000000;
                    } else if (masaKerja >= 6 && masaKerja <= 8) {
                        tunjangan = 2000000;
                    } else if (masaKerja > 8) {
                        tunjangan = 3000000;
                    }

                    potonganCuti = jumlahCuti * 35000;

                    totalGaji = (int) (komisi + tunjangan - potonganCuti);

                    System.out.println("==================================================");
                    System.out.println("DATA GAJI KARYAWAN");
                    System.out.println("==================================================");
                    System.out.println("Nama : " + namaKaryawan);
                    System.out.println("Komisi Penjualan : " + komisi);
                    System.out.println("Tunjangan : " + tunjangan);
                    System.out.println("Potongan Cuti : " + potonganCuti);
                    System.out.println("Gaji yang diterima : " + totalGaji);
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        }
    }
}