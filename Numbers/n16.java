package Numbers;

import java.util.Scanner;

//Toc check number is harshad number or not
//Ex: 18 =1+8=9 18%9=0
public class n16 {
    public static void main(String[] args) {
        System.out.println("Enter the the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int ld;
        int sum=0;
        int temp=num;
        while(temp!=0){
            ld=temp%10;
            sum+=ld;
            temp/=10;

        }
        System.out.println(sum);
        if(num%sum==0)
            System.out.println("It is harshad number");
        else
            System.out.println("It is not harshad number");



    }
}
