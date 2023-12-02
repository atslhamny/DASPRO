/**
 * NestedLoop
 */
public class NestedLoop {

    public static void main(String[] args) {
        //stdk1For();
        // stdk1While();
        // stdk1doWhile();

        // stdk2For();
        // stdk2While();
        // stdk2doWhile();

        percobaan1();
    }
    static void stdk1For(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void stdk1While(){
        int i = 0;
        while (i<4) {
            int j = 0;
            while (j<4) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static void stdk1doWhile(){
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j<4);
            System.out.println();
            i++;
        } while (i<4);
    }
    static void stdk2For(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void stdk2While(){
        int i = 0;
        while (i<10) {
            int j = 0;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static void stdk2doWhile(){
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j<=i );
            System.out.println();
            i++;
        } while (i<10);
    }
    static void percobaan1(){
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void percobaan2(){
        
    }
}