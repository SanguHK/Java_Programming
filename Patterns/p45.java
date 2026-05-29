package Patterns;
/* 
 12345
  2345
   345
    45
     5*/
public class p45 {
	
		public static void main (String[] args) {
			int row=5;
			int col=5;
			
			for(int i=0;i<row;i++) {
				int num=1+i;
				for(int j=0;j<=col;j++) {
					 
					if(j<=i)
						System.out.print(' ');
					else
						System.out.print(num++);
					
				}
				System.out.println();
			}
		}}		


