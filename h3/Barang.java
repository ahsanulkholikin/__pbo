public class Barang {
    private String id, namaBarang, satuan;
    private int harga;
    //Constructor
    public Barang(String id, String namaBarang,String satuan, int harga) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.harga = harga;
    }
    // deklarasi method
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public String getSatuan() {
        return satuan;
    }
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void kenalan(){
        System.out.println("Barang ini adalah "+ this.namaBarang);
    }
}
