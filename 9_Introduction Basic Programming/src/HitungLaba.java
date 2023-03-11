import java.util.Scanner;
public class HitungLaba {
    public static void main(String[] args) {
        int beli, jual, total;

        Scanner nilai = new Scanner (System.in);

        System.out.println("Program Hitung Laba dan Rugi Penjualan");
        System.out.println("Masukkan harga beli: ");
        beli = nilai.nextInt();
        System.out.println("Masukkan harga jual: ");
        jual = nilai.nextInt();

        total = jual-beli;

        if (total > 0){
            System.out.println("Anda untung sebesar Rp. " + total);
        }
        else if (total < 0) {
            System.out.println("Anda rugi sebesar Rp. " + total*(-1));
        }
        else if (jual == beli) {
            System.out.println("Anda tidak untung maupun rugi");
        }

    }
}
