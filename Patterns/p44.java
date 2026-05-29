package Patterns;
/*
 54321
  4321
   321
    21
     1
     */
public class p44 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			int num=5-i;
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(num--);
				
			}
			System.out.println();
		}
		
	}
}
