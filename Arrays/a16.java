package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

//to print the duplicate elements in an array using collection
public class a16 {
        public static void main(String[] args) {
             int[] a= {40,20,50,10,30,10,20,50,40,45,10,20};
            System.out.println(Arrays.toString(a));

            Arrays.sort(a);
            System.out.println(Arrays.toString(a));

         Collection<Integer> l=   new HashSet<>();
         for (int i=0; i<a.length;i++) {
           if(! l.add(a[i]))
            System.out.println(a[i]);
            
         }
         System.out.println(l);
        }
}
