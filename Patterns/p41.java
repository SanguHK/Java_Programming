package Patterns;
/*
 EDCBA
  DCBA
   CBA
    BA
     A
*/
public class p41 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			char ch=(char)('E'-i);
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(ch--);
				
			}
			System.out.println();
		}
		
	}
}
