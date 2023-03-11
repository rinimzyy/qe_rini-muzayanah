public class Product {
    private String nama;
    private String deskripsi;
    int harga;
    int stok;
    public void setName(String nama){
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setStok(int stok){
        this.stok = stok;
    }
//     ini method getter
    public String getName(){
        return this.nama;
    }
    public String getDeskripsi(){
        return this.deskripsi;
    }

    public int getHarga(){
        return this.harga;
    }

    public int getStok(){
        return this.stok;
    }

    void getInfo(){
        System.out.println("====================");
        System.out.println("Nama produk: "+ this.nama);
        System.out.println("Deskripsi: "+ this.deskripsi);
        System.out.println("Harga: "+ this.harga);
        System.out.println("Stok: "+ this.stok);
    }
}
