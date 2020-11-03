import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputkeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String Nama = " ";
        System.out.println("Inputkan Nama Anda : ");
        try{
            Nama = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error....");
        }
        System.out.println("Hello : " + Nama);
    }
}
