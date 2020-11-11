import java.util.Scanner;

public class Ifelse {
    public static void main(String[] String) {
        int a, b, c;
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukan Nilai a: ");
        a = masuk.nextInt();
        System.out.print("Masukan Nilai b: ");
        b = masuk.nextInt();
        System.out.print("Masukan Nilai c: ");
        c = masuk.nextInt();

        int hasil = (int) (b * b - 4.0 * a * c);

        if (hasil == 0) {
            System.out.println("akar kembar");
        } else if (hasil > 0) {
            System.out.println("akar beda ");
        } else if (hasil < 0) {
            System.out.println("akar imajiner");
        } else {
            System.out.println("akar tak diketahui (belum diprogram)");
        }

    }
}