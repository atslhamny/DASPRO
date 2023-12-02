public class array10 {
    public static void main(String[] args) {
        // Inisialisasi array dengan 10 elemen
        int[] array = new int[10];
        
        // Mengisi array dengan nilai dari 1 hingga 10
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        
        // Menampilkan isi array secara terbalik
        System.out.print("Isi array secara terbalik: [");
        for (int i = 10 - 1; i >= 0; i--) {
            // Jika ini bukan elemen terakhir, tambahkan koma setelah nilai
            if (i > 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }
}
