import java.util.Scanner;

/**
 * tugas
 */
public class tugas {

    public static void main(String[] args) {
        Tgs1();
        
    }

    static void Tgs1(){
        Scanner input = new Scanner(System.in);
        int Jarak;
        
        System.out.println("Masukkan Jarak");
        Jarak = input.nextInt();

        if (Jarak < 5) {
            System.out.println("Melee Weapon");
        } else {
            System.out.println("Ranged Weapon");
        }
    }
}