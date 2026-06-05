package Numbers;
//to check the number is tech number or not
import java.util.Scanner;

public class n12 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(numOfDigits(num)%2==0){
            isTech(num);
        }
        else{
            System.out.println(num +" It is not a even digit number");
        }
    }
    //to return the no of digits
   public static int numOfDigits(int num){
    int digit=0;
    while(num!=0){
        num/=10;
        digit++;
    }
    return digit;
   }


   // to divide number into half and sum it and square the sum
   public static void isTech(int num){
        int divisor=10,digits=numOfDigits(num);
        for(int i=1;i<digits/2;i++)
            divisor=divisor*10;

        int first_half=num/divisor;
        int second_half=num%divisor;
        int sum=first_half+second_half;
        sum*=sum;
        if(num==sum)
            System.out.println(num +" It is a tech number");
        else
               System.out.println(num +" It is not a tech number");


   }
}
