import java.util.Scanner;
public class LuasLingkaran {
    public static void main(String[] args) {
        double jari, luas;

        Scanner nilai = new Scanner (System.in);

        System.out.println("Program Hitung Luas Lingkaran");
        System.out.println("Masukkan nilai jari-jari: ");
        jari = nilai.nextInt();

        luas = 3.14 *(jari*jari);
        System.out.println("Luas lingkaran adalah " + luas);

    }
}
