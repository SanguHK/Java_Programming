package Patterns;
/*
1    
22   
333  
4444 
55555

*/

public class p15 {
public static void main(String[] args) {
	int row=5;
	int col=5;
	
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=col;j++) {
			if(j<=i)
				System.out.print(i);
			else
				System.out.print(' ');
		}
		System.out.println();
	}
	
}
}

