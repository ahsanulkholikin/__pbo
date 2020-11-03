import java.util.Scanner;
import java.io.InputStream;

public class Scanner1 {
    public static void main(String[] args){
        String nama,alamat;
        int usia,gaji;
        Scanner a = new Scanner(System.in);
        
        System.out.println("Data Karyawan AMIKOM");
        System.out.println("Nama Karyawan : ");
        nama = a.nextLine();
        System.out.println("Alamat Karyawan : ");
        alamat = a.nextLine();
        System.out.println("Usia : ");
        usia = a.nextInt();
        System.out.println("Gaji : ");
        gaji = a.nextInt();

        System.out.println("==============================");
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Alamat Karyawan : "+alamat);
        System.out.println("Gaji : "+gaji);
        System.out.println("Usia : "+usia);
        System.out.println("==============================");
    }
}
