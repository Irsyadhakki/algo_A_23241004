import java.util.Scanner;

public class MencariPercepatanDanKecepatan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        double kecepatanAwal, kecepatanAkhir, waktu, percepatan;
        
        System.out.print("kecepatan awal: ");
        kecepatanAwal = input.nextDouble();

        System.out.print("kecepatan akhir: ");
        kecepatanAkhir = input.nextDouble();

        System.out.print("waktu yang diperlukan: ");
        waktu = input.nextDouble();
     
        percepatan = (kecepatanAkhir - kecepatanAwal) / waktu;
    
        System.out.println("Percepatan adalah: " + percepatan + " m/s^2");
        input.close();
    }
}
