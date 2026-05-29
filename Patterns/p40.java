package Patterns;
/*
 55555
  4444
   333
    22
     1

*/
public class p40 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		int num=5;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(num);
				
			}num--;
			System.out.println();
		}
		
	}

}
