package Patterns;
/* 
 12345
  6789
   123
    45
     6*/
public class p46 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		int num=1;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(num++);
				if(num==10)
					num=1;
			}
			System.out.println();
		}
	}
}
