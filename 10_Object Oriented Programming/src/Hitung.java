public class Hitung extends Kalkulator{
    public static void main (String [] args) {

        Hitung hitung= new Hitung();

        System.out.println("=== PROGRAM KALKULATOR ===");

        hitung.add(3,4);
        hitung.substract(15, 4);
        hitung.multiply(10, 10);
        hitung.divide(12, 3);
        System.out.println();
    }
}
