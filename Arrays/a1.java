package Arrays;

import java.util.Arrays;

public class a1 {
    public static void main(String[] args) {
        int a[]={40,50,10,20,30};
        System.out.println(Arrays.toString(a));
        int b[]=new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];

            
        }
         System.out.println(Arrays.toString(a));
    }
}
