package Patterns;
/* 
 54321
  5432
   543
    54
     5*/
public class p36 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			int num=5;
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(num--);
				
			}
			System.out.println();
		}
		
	}

}
