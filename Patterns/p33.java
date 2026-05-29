package Patterns;

/*   
 ABCDE
  ABCD
   ABC
    AB
     A*/
public class p33 {
	public static void main (String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++) {
			char ch='A';
			for(int j=0;j<=col;j++) {
				 
				if(j<=i)
					System.out.print(' ');
				else
					System.out.print(ch++);
				
			}
			System.out.println();
		}
		
	}


}
