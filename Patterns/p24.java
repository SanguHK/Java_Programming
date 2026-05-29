package Patterns;
/*
1    
10   
101  
1010 
10101*/
public class p24 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=col;j++) {
				if(j<=i)
					System.out.print((j)%2);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
		
	}

}
