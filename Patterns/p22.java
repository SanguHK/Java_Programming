package Patterns;
/*
1    
01   
101  
0101 
10101*/

public class p22 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=col;j++) {
				if(j<=i)
					System.out.print((i+j+1)%2);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
		
	}

}
