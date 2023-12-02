public class BubbleSortExample04 {
    public static void main(String[] args) {
        
        int[] data = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                // if (data[j-1] > data[j]) { //ascending
                if(data[j-1] < data[j]){ // descending
                    //swap elemen
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        System.out.println("Hasil Pengurutan: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
