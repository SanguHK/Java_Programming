package Patterns;
/*  12345
	67891
	23456
	78912
	34567
*/

public class p10 {
public static void main(String [ ] args) {
		
		int num =1;
		for(int i=0;i<5;i++) {
			
			for( int j=0;j<5;j++) {
				System.out.print(num++);
				// num++;
				if(num==10)
					num=1;
								
			}
			
			System.out.println();
		}
	}

}
