package Patterns;
/* 
 12345
  1234
   123
    12
     1*/

public class p35 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(num++);
				
			}
			System.out.println();
		}
		
	}

}
