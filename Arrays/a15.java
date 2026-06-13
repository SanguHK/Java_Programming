package Arrays;

import java.util.Arrays;

//WAP to print the duplicate values
public class a15 {
    public static void main(String[] args) {
        int[] a= {40,20,50,10,30,10,20,50,40,45,10,20};
         System.out.println(Arrays.toString(a));

         Arrays.sort(a);
          System.out.println(Arrays.toString(a));
          for (int i = 0; i < a.length-1; i++) {
           
                if (a[i]==a[i+1]) {
                    System.out.println(a[i]);
                    
                
                
            }
            
          }

    }
}
