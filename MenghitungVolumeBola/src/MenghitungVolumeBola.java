import java.util.Scanner;

public class MenghitungVolumeBola {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        double jariJari, volume;
       
        System.out.print("jari-jari bola: ");
       
        jariJari = input.nextDouble();
       
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        
        System.out.println("Volume bola adalah: " + volume);

        input.close();
    }
}


