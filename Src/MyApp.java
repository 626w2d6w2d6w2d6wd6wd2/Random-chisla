import java.util.Arrays;
import java.util.Random;

public class MyApp {
   public static void main(String[]args) {

       int[] arr = new int[94];

       for (int i = 0, j = 1; j <= 100; j++) {
           int d1 = j % 10;
           int d2 = j / 10;
           if (d1 != 4 && d2 != 4 && d1 != 9 && d2 != 9) {
               arr[i++] = j;
           }
       }
       System.out.println(Arrays.toString(arr));
   }
}




