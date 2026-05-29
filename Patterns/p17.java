package Patterns;
/*
E    
DD   
CCC  
BBBB 
AAAAA
*/
public class p17 {
	public static void main(String[] args) {
		int row=5;
		int col=5;
		char ch='E';
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j<=i)
					System.out.print(ch);
				else
					System.out.print(' ');
				
			}ch--;
			System.out.println();
		}
		
	}
}
