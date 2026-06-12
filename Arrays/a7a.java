package Arrays;
//Insertion Sort decreasing order
import java.util.Arrays;

public class a7a {
    public static void main(String[] args) {
        int[] a={40,20,50,10,30};
         System.out.println(Arrays.toString(a));
        InsertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void InsertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {

                int temp=a[i];
                int j=i-1;
                while(j>=0 &&  temp>a[j]){
                    a[j+1]=a[j];
                    j--;
                }
                 a[j+1]=temp;

            //    System.out.println(Arrays.toString(a)); 
            }
            
        }
}
