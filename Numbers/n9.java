package Numbers;

import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int n1=0, n2=1, n3;
        if(num==1)
        System.out.print(n1);
        else if(num==2)
             System.out.print(n1+" "+n2);

        else{
            System.out.print(n1+" "+n2);
             while(num>2){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            num--;
        }
        }
       
    }
}
