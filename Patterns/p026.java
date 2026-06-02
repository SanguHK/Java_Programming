public class p026 {
       public static void main(String[] args) {
        int row=4;
       int no_space=0;
       int no_char=2*row-1;

        for (int i = 0; i <row; i++) {
            
            for (int j = 0; j <no_space ; j++) { 
                System.out.print(' ');
            }

            for (int k = 0; k <no_char; k++) {
                if(i==0||k==0||k==no_char-1)
                System.out.print('*');  
            else
                 System.out.print(' '); 
        }
        System.out.println();  
        no_space++;
        no_char-=2;
    }
}
}
