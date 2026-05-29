package Patterns;
/*
54321
5432 
543  
54   
5   */
public class p71 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			int num=row;
			for(int j=0;j<col;j++) {
				 
				if(j+i<=row-1)
					System.out.print(num--);
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
	}
}
