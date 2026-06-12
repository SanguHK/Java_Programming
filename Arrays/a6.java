package Arrays;

import java.util.Arrays;

public class a6 {
    public static void main(String[] args) {
         int[] a={40,20,50,10,30};
         System.out.println(Arrays.toString(a));
        InsertionSort(a);
        // System.out.println(Arrays.toString(a));


    }
    public static void InsertionSort(int[] a){
        
        for(int i=0;i<a.length;i++){
            int min=i;
            int temp;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                   min=j;
                  
                }
            } 
                temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            
             System.out.println(Arrays.toString(a));
           
        }
    }
}
