package Patterns;
/*
1    
00   
111  
0000 
11111*/

public class p23 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=col;j++) {
				if(j<=i)
					System.out.print((i)%2);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
		
	}

}
