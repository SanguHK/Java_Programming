package Patterns;
/*
12345
1234 
123  
12   
1 */
public class p66 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<col;j++) {
				 
				if(j+i<=row-1)
					System.out.print(num++);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
	}
}
