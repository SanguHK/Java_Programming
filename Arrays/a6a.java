package Arrays;
//Selection sort decreasing order
import java.util.Arrays;

public class a6a {
    public static void main(String[] args) {
         int[] a={40,20,50,10,30};
         System.out.println(Arrays.toString(a));
        InsertionSort(a);
        // System.out.println(Arrays.toString(a));


    }
    public static void InsertionSort(int[] a){
        
        for(int i=0;i<a.length;i++){
            int max=i;
            int temp;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[max]){
                   max=j;
                  
                }
            } 
                temp=a[max];
                a[max]=a[i];
                a[i]=temp;
            
             System.out.println(Arrays.toString(a));
           
        }
    }
}
