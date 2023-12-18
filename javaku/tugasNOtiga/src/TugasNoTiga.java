import java.util.Scanner;

public class TugasNoTiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("nilai UTS: ");
        nilaiUts = input.nextDouble();

        System.out.print("nilai UAS: ");
        nilaiUas = input.nextDouble();

        nilaiAkhir = (nilaiUts + nilaiUas) / 2;

        if (nilaiAkhir >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
