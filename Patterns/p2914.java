public class p2914{
    public static void main(String[] args){
        int row=5;
        int no_space=0;
        int no_char=2*row-1;
        int num=0;

        for(int i=0; i<row;i++){
             char ch=(char)('I'-2*i);
            for(int j=0;j<no_space;j++){
                System.out.print(' ');
            }
            for(int k=0;k<no_char;k++){
                System.out.print((num)%2);  
            }
            System.out.println();
            no_space++;
            no_char-=2;
            num++;
          
        }
    }
}