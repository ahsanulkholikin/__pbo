import java.util.Scanner;

public class Ifelse{
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
    else
        System.out.println("\nSaldo anda tidak cukup!!!!");
    System.out.println("\nSaldo Akhir Tabungan anda Rp."+saldo);

    }
}