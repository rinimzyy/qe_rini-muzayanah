import java.util.Scanner;
public class SegitigaBintang {
    public static void main(String[] args) {
        int baris;

        Scanner nilai = new Scanner (System.in);

        System.out.println("Banyaknya baris: ");
        baris = nilai.nextInt();

        for( int i=1; i<=baris; i++) {

            for(int j=1; j<=baris-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
