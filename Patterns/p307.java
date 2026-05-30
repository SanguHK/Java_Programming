class p305
{
    public static void main(String[] args){
        int row=7;
        int no_space=2*row-1;
        int no_char=1;
        

        for(int i=0;i<row;i++){
            char ch='A';
            for(int j=0; j<no_space;j++)
                System.out.print(' ');
            
            for(int k=0; k<no_char;k++)
                System.out.print(ch++);
                
            System.out.println();
            if(i<row/2)
            {
            no_space--;
            no_char+=2;
            
            }
            else{
            no_space++;
            no_char-=2;
            
            }
            

        }
    }
}
