
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int j=1;j<n;j++)
        {
    
            if(n % j == 0)
            {
                a[j-1] = j;
                
               
            }
            
        
        }
        for(int i : a){
            System.out.print(i + " ");
        }
        
    }
} 
    

