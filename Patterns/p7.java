package Patterns;
/* pattern-7
 * 
EDBCA
EDBCA
EDBCA
EDBCA
EDBCA


  */
public class p7{
	public static void main(String [ ] args) {
		
		int row=5;
		int col=5;
		for(int i=0;i<row;i++) {
			char ch='E';
			for( int j=0;j<col;j++) {
				System.out.print(ch--);
				
				
			}
			
			System.out.println();
		}
	}

}
