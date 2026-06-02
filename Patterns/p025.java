public class p025 {
    public static void main(String[] args) {
        int row=4;
       int no_space= row-1;
       int no_char=1;

        for (int i = 0; i <row; i++) {
            
            for (int j = 0; j <no_space ; j++) { 
                System.out.print(' ');
            }

            for (int k = 0; k <no_char; k++) {
                if(i==row-1||k==0||k==no_char-1)
                System.out.print('*');  
            else
                 System.out.print(' '); 
        }
        System.out.println();  
        no_space--;
        no_char+=2;
    }
}
}
