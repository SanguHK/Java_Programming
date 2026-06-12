//TO find the second largest element in the array
package Arrays;

public class a11 {
    public static void main(String[] args) {
        int[] a= {40,20,50,10,30,10,20,50,40,45};

        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>first_max){
                second_max=first_max;
                first_max=a[i];
            }
           
           if (a[i]<first_max && a[i]>second_max) {
            second_max=a[i];
            
        } 
        }
        System.out.println(second_max);
        
    }
}
