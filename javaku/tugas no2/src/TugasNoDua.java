public class TugasNoDua {
    
    static final double pi = 3.1714;

    public static void main(String[] args) {
        
        double gajiTotal, gajiPokok, tunjangan, potGaji;
        int MD1, MD2;
        int Urutan, Ranking;
        char CC1, CC2;
        String S1, massage;
        boolean Found;

        gajiPokok = 50000.0; 
        tunjangan = 15000.0; 
        potGaji = 3000.0; 
        gajiTotal = gajiPokok + tunjangan - potGaji;
        System.out.println("Gaji Total: " + gajiTotal);

        MD1 = 10;
        MD2 = 20;
        Urutan = 1;
        Ranking = 3;
        System.out.println("MD1: " + MD1);
        System.out.println("MD2: " + MD2);
        System.out.println("Urutan: " + Urutan);
        System.out.println("Ranking: " + Ranking);

        CC1 = 'A';
        CC2 = 'B';
        System.out.println("CC1: " + CC1);
        System.out.println("CC2: " + CC2);

        S1 = "pendidikan teknologi informasi";
        massage = "tetap semangat bro";

        System.out.println("S1 " + S1);
        System.out.println("massage " + massage);

        Found = true;
        System.out.println("Nilai Found: " + Found);

        int hasilPenjumlahan = addYX(5, 10);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
    }

    public static int addYX(int X, int Y) {
        return X + Y;
    }
}

