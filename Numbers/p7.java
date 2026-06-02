package Numbers;

import java.util.Scanner;

public class p7 {
     public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in) ;
        int num=sc.nextInt();
        
        int digit=0;
        int product=1;
        while(num!=0){
            digit=num%10;
            product*=digit;
            num/=10;
            
        }
        System.out.println(product);
    }
}
