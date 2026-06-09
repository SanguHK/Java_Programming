package Arrays;

import java.util.Arrays;

public class a2 {
    public static void main(String[] args) {
        int a[]={40,50,10,20,30};
        System.out.println(Arrays.toString(a));
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];

            
        }
         System.out.println(sum);
    }
}
