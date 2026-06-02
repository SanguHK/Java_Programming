package Numbers;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in) ;
        int num=sc.nextInt();
        
        int digit=0;
        int sum=0;
        while(num!=0){
            digit=num%10;
            sum+=digit;
            num/=10;
            
        }
        System.out.println(sum);
    }
}
