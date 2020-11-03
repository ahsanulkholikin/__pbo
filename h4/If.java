import java.util.Scanner;

public class If{
    public static void main(String[] args) {
    int saldo, tarik;
    
    System.out.println("Masukan Nominal Tabungan : ");
    Scanner keySaldo = new Scanner(System.in);
    saldo = keySaldo.nextInt();
    
    System.out.println("Jumlah Penarikan : ");
    Scanner keyTarik = new Scanner(System.in);
    tarik = keyTarik.nextInt();

    if(tarik <= saldo)
        saldo = saldo - tarik;
    System.out.println("\nSaldo Akhir Tabungan anda Rp."+saldo);

    }
}