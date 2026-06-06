package Numbers;
//CUBE ROOT
import java.util.Scanner;

public class n14 {
     public static void main(String[] args) {
        System.out.println("Enter the the number:");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        
        double cbrt=num/3;
        double temp=0;

        while(cbrt-temp!=0){
            temp=cbrt;
            cbrt=(2*temp+num/(temp*temp))/3;

        }
        System.out.println(cbrt);
    }
}
