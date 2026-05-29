package Patterns;
/* pattern-6
 * 
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE


  */
public class p6{
	public static void main(String [ ] args) {
		
		int row=5;
		int col=5;
		for(int i=0;i<row;i++) {
			char ch='A';
			for( int j=0;j<col;j++) {
				System.out.print(ch++);
				// ch++;
				
			}
			
			System.out.println();
		}
	}

}
