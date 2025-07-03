import java.util.*;

public class nofflowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

    
        int f = 0;

        int id = 0;
        for(int i=0;i<n-1;i++){
            if(a[i] < a[i+1]){
                f++;
                a[i] = f;
                
              

            }
            else if(a[i]> a[i+1]){

                
            }
        }

    }
}
