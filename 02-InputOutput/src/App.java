import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nama ;
        String prodi ;
        int nim ;
        double tinggi_badan ;

        Scanner input = new Scanner(System.in);

        System.out.println("BIODATA MAHASISWA");
        System.out.println("=================");

        System.out.print("masukan nama mahasiswa :");
        nama = input.nextLine();

        System.out.print("masukan prodi:");
        prodi = input.nextLine();

        System.out.print("masukan nim :");
        nim = input.nextInt();

        System.out.print("masukan tinggi badan :");
        tinggi_badan = input.nextDouble();

        System.out.println("DATA MAHASISWA");
        System.out.println("=================");
        System.out.println("nama : " + nama);
        System.out.println("prodi :" + prodi);
        System.out.println("nim :" + nim);
        System.out.println("tinggi badan : " + tinggi_badan);
       
  

      
    }
}
