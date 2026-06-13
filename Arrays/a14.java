//to print the duplicate elements and 
package Arrays;

import java.util.Arrays;

public class a14 {
    public static void main(String[] args) {
        int[] a= {40,20,50,10,30,10,20,50,40,45,10,20};
         System.out.println(Arrays.toString(a));

         for (int i = 0; i < a.length; i++) {
            boolean duplicate=false;

            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    duplicate=true;
                    break;
                }
                
            }
            if(duplicate){
                System.out.println(a[i]);
            }
         }
    }
}
