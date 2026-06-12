package Arrays;
//To find the minimum value in the array
import java.util.Arrays;

public class a10 {
    public static void main(String[] args) {
        int[] a={40,20,50,10,30};
         System.out.println(Arrays.toString(a));

         int min=Integer.MAX_VALUE;
         for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
            
         }
         System.out.println(min);
    }   
}

