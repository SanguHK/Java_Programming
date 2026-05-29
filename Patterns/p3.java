package Patterns;
/* pattern-3
 * EEEEEE
 * DDDDD
 * CCCCC
 * BBBBB
 * AAAAA
  */
public class p3 {
	public static void main(String [ ] args) {
		//char [] arr= {'A','B','C','D','E'};
		char ch='E';
		int row=5;
		int col=5;
		for(int i=0;i<row;i++) {
			for( int j=0;j<col;j++) {
				System.out.print(ch);
				
			}
			ch--;
			System.out.println();
		}
	}

}
