package Arrays;
import java.util.ArrayList;
//Sorting using collection
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class a8 {
    public static void main(String[] args) {
        int[] a={40,20,50,10,30};
         System.out.println(Arrays.toString(a));
        
    List <Integer> c= new ArrayList<Integer>();
    for (int i = 0; i < a.length; i++) {
        c.add(a[i]);   
    }
    System.out.println(c);
        Collections.sort(c,Collections.reverseOrder());
        System.out.println(c);
    }
}
