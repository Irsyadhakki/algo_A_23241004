import java.util.Scanner;

public class konversi {
    public static void main(String[] args) throws Exception {
        System.out.println("Konversi angka ke huruf!");

        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        if (nilai > 80) {
            System.out.println("A");
        } else if (nilai > 70 && nilai <= 79) {
            System.out.println("B");
        } else if (nilai > 60 && nilai <= 69) {
            System.out.println("C");
        } else if (nilai > 50 && nilai <= 59) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        
        scan.close();
    }
}

