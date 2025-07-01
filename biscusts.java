import java.util.Scanner;
public class biscusts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        if(m > (n-k)+1){
            m = m - (n-k)+1;
        }
        else {
            m = m+k - 1;    
            
        }
        
        
        System.out.print(m);
    }
}

