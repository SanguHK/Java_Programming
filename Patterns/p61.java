package Patterns;
/*
 *  1
   22
  333
 4444
55555
*/
public class p61 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		int num=1;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				 
				if(j+i>=row-1)
					System.out.print(num);
				else
					System.out.print(' ');
				
			}num++;
			System.out.println();
		}
	}
}
