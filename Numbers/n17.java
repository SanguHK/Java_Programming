package Numbers;
//TO check the number is emirp
import java.util.Scanner;

public class n17 {
    public static void main(String[] args) {
        System.out.println("Enter the the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
          if(isPrime(reverse(num))) 
             System.out.println("It is emirp number");
           
             else
            System.out.println("It is not  emirp number");



        }
        else{
            System.out.println("It is not a emrip number,because it is not prime");
        }

        
    }
    public static int reverse(int num){
        int temp=num;
        int rev=0;
        int ld=0;
        while(temp!=0){
            ld=temp%10;
            rev=rev*10+ld;
            temp/=10;
        }
        System.out.println(rev);
        return rev;
    }
    public static boolean isPrime(int num) {
        boolean flag=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    
}
