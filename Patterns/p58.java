package Patterns;
/*
  
    5
   45
  345
 2345
12345
*/
public class p58 {
	public static void main(String [] arg) {
	int row=5;
	int col=5;
	
	for(int i=0;i<row;i++) {
		int num=row-i;
		for(int j=0;j<col;j++) {
			 
			if(j+i>=row-1)
				System.out.print(num++);
			else
				System.out.print(' ');
			
		}
		System.out.println();
	}
}
}
