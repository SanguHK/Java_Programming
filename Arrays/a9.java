package Arrays;

import java.util.Arrays;

public class a9 {
    public static void main(String[] args) {
        int[] a={40,20,50,10,30};
         System.out.println(Arrays.toString(a));

         int max=Integer.MIN_VALUE;
         for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
            
         }
         System.out.println(max);
    }   
}
