public class p011 {
    public static void main(String[] args) {
        
        int row=5;
        int no_space=0;
        int no_char=row;

        for(int i=0; i<row;i++){

            for (int j = 0; j < no_space; j++) {
                System.out.print(' ');
            }
            
            for (int k = 0; k < no_char; k++) {
                System.out.print('*');

                
            }
            System.out.println();
            if(i<row/2){
             no_space++;
                no_char-=2;   
            }
            else{
                no_space--;
                no_char+=2;
            }
        }
    }
}
