package Numbers;

import java.util.Scanner;

//SQUARE ROOT
public class n13 {
    public static void main(String[] args) {
        System.out.println("Enter the the number:");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        
        double sqrt=num/2;
        double temp=0;

        while(sqrt-temp!=0){
            temp=sqrt;
            sqrt=(temp+num/temp)/2;

        }
        System.out.println(sqrt);
    }
}
