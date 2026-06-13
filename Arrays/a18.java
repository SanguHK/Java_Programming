// to print the no of occurences of the element in array using maps

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class a18 {
    public static void main(String[] args) {
        int[] a={40,20,50,10,30,10,20,10,40};

            Map<Integer,Integer> h=new HashMap<>();
            for (int i = 0; i < a.length; i++) {
                if (h.containsKey(a[i])) {
                    h.put(a[i], h.get(a[i])+1);                    
                }
                else
                    h.put(a[i], 1);
            }
            System.out.println(h);
    }
}
