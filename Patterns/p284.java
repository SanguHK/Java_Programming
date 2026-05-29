public class p284{
    public static void main(String[] args){
        int row=5;
        int no_spaces=row-1;
        int no_chars=1;
        
        for(int i=0; i<row;i++){
            char ch='A';
            for(int j=0; j<no_spaces;j++){
                System.out.print(' ');
            }
            for(int k=0;k<no_chars;k++){
                System.out.print(ch++);
            }
             System.out.println();
        no_spaces--;
        no_chars+=2;
        


        }
       
    }
}