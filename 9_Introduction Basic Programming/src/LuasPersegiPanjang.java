import java.util.Scanner;
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        float panjang, lebar, luas;

        Scanner nilai = new Scanner (System.in);

        System.out.println("Program Hitung Luas Persegi Panjang");
        System.out.println("Masukkan nilai panjang: ");
        panjang = nilai.nextInt();
        System.out.println("Masukkan nilai lebar: ");
        lebar = nilai.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas segitiga adalah " + luas);

    }
}
