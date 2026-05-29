
package Patterns;
/*
1     
21    
321   
4321  
54321*/

public class p27 {
	public static void main (String[] args) {
	int row=5;
	int col=5;
	
	for(int i=0;i<row;i++) {
		int num=1+i;
		for(int j=0;j<=col;j++) {
			 
			if(j<=i)
				System.out.print(num--);
			else
				System.out.print(' ');
			
		}
		System.out.println();
	}
	
}

}
