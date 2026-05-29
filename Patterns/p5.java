package Patterns;
/* pattern-4
 55555
 44444
 33333
 22222
 11111
  */
public class p5 {
	public static void main(String [ ] args) {
		
		int row=5;
		int col=5;
		for(int i=5;i>=1;i--) {
			for( int j=0;j<col;j++) {
				System.out.print(i);
				
			}
		
			System.out.println();
		}
	}

}
