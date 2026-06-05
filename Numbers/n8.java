

package Numbers;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int fact=1;
    //     for(int i=1;i<=num;i++){
    //         fact*=i;

    //     }
    //     System.out.println(fact);

    while(num!=0){
        fact*=num;
        num--;
    }
      System.out.println(fact);
    }
}
