import java.util.*;
public class jumpgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] a = {2,0,0,3,4};
        int n = a.length;

        boolean canJump = true;
        for(int i=0;i<n;i++){
            int c = 0;
           
            if(a[i] >= 0 ){

                c = a[i];
                if(c == 0){
                    System.out.println("cannot jump");
                    canJump = false;
                    break;
                    
                }
                else{

                    
                i = c;
                }
            }
            
            
        }

        if(canJump){
                System.out.println("can jump");
            }
       
    }
}
