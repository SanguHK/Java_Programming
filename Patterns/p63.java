package Patterns;
/*
EDCBA
EDCB 
EDC  
ED   
E */
public class p63 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		int num=1;
		for(int i=0;i<row;i++) {
			char ch='E';
			for(int j=0;j<col;j++) {
				 
				if(j+i<=row-1)
					System.out.print(ch--);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
	}
}
