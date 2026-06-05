package Numbers;

import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

      
        int sum=0;
       for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum+=i;
        }
       }
       
        if(num==sum)
            System.out.println(num +" It is a perfect number");
        else
            System.out.println(num +" It is not a perfect number");            

    }
}

