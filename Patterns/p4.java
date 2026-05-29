package Patterns;
/* pattern-4
 11111
 22222
 33333
 44444
 55555
 
 
  */
public class p4 {
	public static void main(String [ ] args) {
		
		int row=5;
		int col=5;
		for(int i=1;i<=row;i++) {
			for( int j=0;j<col;j++) {
				System.out.print(i);
				
			}
		
			System.out.println();
		}
	}

}
