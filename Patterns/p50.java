package Patterns;
/*
11111
 0000
  111
   00
    1
*/
public class p50 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				 
				if(j<i)
					System.out.print(' ');
				else
					System.out.print((i+1)%2);
				
			}
			System.out.println();
		}
	}
}
