import java.util.Scanner;

public class GanjilGenapTugas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        
        scanner.close();
    }
}
