import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args) {
        float alas, tinggi, luas;

        Scanner nilai = new Scanner (System.in);

        System.out.println("Program Hitung Luas Segitiga");
        System.out.println("Masukkan nilai alas: ");
        alas = nilai.nextInt();
        System.out.println("Masukkan nilai tinggi: ");
        tinggi = nilai.nextInt();

        luas = (alas * tinggi)/2;
        System.out.println("Luas segitiga adalah " + luas);

    }
}
