package Patterns;
/*
    A
   BB
  CCC
 DDDD
EEEEE*/
public class p59 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		char ch='A';
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				 
				if(j+i>=row-1)
					System.out.print(ch);
				else
					System.out.print(' ');
				
			}ch++;
			System.out.println();
		}
	}
}
