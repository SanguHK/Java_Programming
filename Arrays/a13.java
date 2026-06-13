package Arrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

//Finding the largest,second largest and smallest element in array
public class a13 {
    public static void main(String[] args) {
         int[] a= {40,20,50,10,30,10,20,50,40,45};
         System.out.println(Arrays.toString(a));

         Arrays.sort(a);
         System.out.println(Arrays.toString(a));

        SortedSet <Integer> t= new TreeSet<>();
        for (int lv : a) {
            t.add(lv);
            
        }
        System.out.println(t);
        // System.out.println(t.getLast());
        // System.out.println(t.getFirst());

     Object[] b=  t.toArray();

     
     System.out.println(b[b.length-1]);
     System.out.println(b[b.length-2]);
     System.out.println(b[b.length-3]);
     System.out.println(b[0]);

    }
}
