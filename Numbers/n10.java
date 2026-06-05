package Numbers;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int ld;
        int temp=num;
        int sum=0;
        while(temp!=0){
            ld=temp%10;
            int fact=1;
            for(int i=ld;i>0;i--){
                fact*=i;

            }
            sum+=fact;
            temp/=10;
            
        }
       
        if(num==sum)
            System.out.println(num +" It is a peterson number");
        else
            System.out.println(num +" It is not a peterson number");            

    }
}
