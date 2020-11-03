public class Kategori extends Barang{
    private String jenis;

    public Kategori(String id, String namaBarang, String satuan, int harga, String jenis) {
        super(id, namaBarang, satuan, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void kenalan(){
        System.out.println("Nama barang ini adalah "+ super.getNamaBarang()+
            "\ndengan jenis  "+ this.jenis+
            "\nserta harga "+ super.getHarga());
    }

}