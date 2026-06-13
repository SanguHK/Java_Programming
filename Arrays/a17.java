
// to print the no of occurences of the element in array 
package Arrays;

public class a17 {
    public static void main(String[] args) {
       int[] a={40,20,50,10,30,10,20,10,40};

       int[] freq=new int[a.length];
        int countover=-1;

        for (int i = 0; i < freq.length; i++) {
             int count=1;
            if(freq[i]!=countover){
               
                for (int j = i+1; j < freq.length; j++) {
                    if (a[i]==a[j]) {
                        count++;
                        freq[j]=countover;
                        
                    }
                    
                }
                freq[i]=count;
            }
            

        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]!=countover) {
                System.out.println(a[i]+"="+freq[i]);
                
            }
        }
    }
}
