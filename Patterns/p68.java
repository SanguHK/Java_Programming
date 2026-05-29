package Patterns;

/*
ABCDE
BCDE 
CDE  
DE   
E  */
public class p68 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			char ch=(char)('A'+i);
			for(int j=0;j<col;j++) {
				 
				if(j+i<=row-1)
					System.out.print(ch++);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
	}
}
