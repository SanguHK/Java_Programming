package Arrays;

import java.util.Arrays;

public class a3 {
    public static void main(String[] args) {
        int a[]={40,50,10,20,30};
        System.out.println(Arrays.toString(a));
        int product=1;

        for (int i = 0; i < a.length; i++) {
            product*=a[i];

            
        }
         System.out.println(product);
    }
}
