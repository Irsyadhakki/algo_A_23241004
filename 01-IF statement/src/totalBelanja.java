import java.util.Scanner;

public class totalBelanja {
    public static void main(String[] args) throws Exception {
        
        int totalBelanja;

        Scanner input = new Scanner(System.in);
        System.out.print("total belanja: ");

        totalBelanja = input.nextInt();

        if(totalBelanja >= 50000){
            System.out.println(" Anda mendapat mouse .");
        }
        else {
            System.out.println("Anda tidak mendapat mouse ");
        }

        input.close();
    }
}
