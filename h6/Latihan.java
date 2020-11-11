import java.util.*;

public class Latihan {
    public static void main(String[] args){
        int[] arr = {1,1,2,3};
        System.out.println(Arrays.stream(arr).average().orElse(Double.NaN));
        System.out.println(Arrays.stream(arr).sum());
        // int sum = 0;
        // String stringArr = Arrays.toString(arr); 
        // System.out.println(stringArr);

        // for(int a : arr){
        //     sum += a;
        //     a++;
        // }
        // System.out.println(sum);
    }
}
