import java.util.Scanner;

public class Switchcase{
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.println("Masukan Pilihan Anda : ");
        pil= masuk.nextInt();

        switch(pil){
            case 1:
                System.out.println("Jurusan Ml/D3");
            break;
            case 2:
                System.out.println("Jurusan TK/D3");
            break;
            case 3:
                System.out.println("Jurusan KA/D3");
            break;
            case 4:
                System.out.println("Jurusan TI/D3");
            break;
            case 5:
                System.out.println("Jurusan SI/D3");
            break;
            default:
                System.out.println("Pilihan Salah");
            break;
        }
    }
}