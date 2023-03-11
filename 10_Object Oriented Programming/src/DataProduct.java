public class DataProduct {
    public static void main(String[] args) {
        Product kopi = new Product();
        Product teh = new Product();

        kopi.setName("Kopi");
        kopi.setDeskripsi("Ini Kopi Java");
        kopi.setHarga(20000);
        kopi.setStok(20);
        kopi.getInfo();

        teh.setName("Teh");
        teh.setDeskripsi("Ini Teh Java");
        teh.setHarga(15000);
        teh.setStok(5);

        System.out.println("====================");
        System.out.println("Nama produk: " + teh.getName());
        System.out.println("Deskripsi: " +teh.getDeskripsi());
        System.out.println("Harga: " +teh.getHarga());
        System.out.println("Stok: " +teh.getStok());
    }
}