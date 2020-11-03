public class Karyawan extends Orang{
    private String jabatan;
    public Karyawan(String id, String nama, int umur,String jabatan) {
    super(id, nama, umur);
    this.jabatan = jabatan;
    }
    public String getJabatan() {
    return jabatan;
    }
    public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
    }
    @Override
    public void kenalan(){
    System.out.println("Halo nama saya "+ super.getNama()+
    "\nSaya menjabat sebagai "+ this.jabatan);
    }
}
