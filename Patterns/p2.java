package Patterns;
/* pattern-2
 AAAAA
 BBBBB
 CCCCC
 DDDD
 EEEEE */
public class p2 {
	public static void main(String [ ] args) {
		//char [] arr= {'A','B','C','D','E'};
		char ch='A';
		int row=5;
		int col=5;
		for(int i=0;i<row;i++) {
			for( int j=0;j<col;j++) {
				System.out.print(ch);
				
			}
			ch++;
			System.out.println();
		}
	}

}
