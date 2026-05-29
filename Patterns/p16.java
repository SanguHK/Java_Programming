package Patterns;

public class p16 {
	public static void main(String[] args) {
		int row=5;
		int col=5;
		char ch='A';
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j<=i)
					System.out.print(ch);
				else
					System.out.print(' ');
				
			}ch++;
			System.out.println();
		}
		
	}

}
