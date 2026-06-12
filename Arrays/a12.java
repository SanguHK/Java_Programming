
//TO find the second smallest element in the array
package Arrays;

public class a12 {
    public static void main(String[] args) {
        int[] a= {40,20,50,10,30,10,20,50,40,45};

        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i]<first_min){
                second_min=first_min;
                first_min=a[i];
            }
           
           if (a[i]<first_min && a[i]>second_min) {
            second_min=a[i];
            
        } 
        }
        System.out.println(second_min);
        
    }
}
