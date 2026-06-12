package Arrays;

import java.util.Arrays;

public class a5a {
     public static void main(String[] args) {
        int[] a={40,20,50,10,30};

        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

public static void bubbleSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                
            }

        }
}
}
