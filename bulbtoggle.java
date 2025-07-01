import java.util.*;
public class bulbtoggle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = 0; 
        }

        for(int i = 1; i <= n; i++){
            for(int j = i - 1; j < n; j = i+j){
                
                if(a[j] == 0){
                    a[j] = 1;
                }
                else {
                    a[j] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int c = 0;

        for(int i = 0; i < n; i++){
            if(a[i] == 1){
                c++;
            }
        }

        System.out.print(c);
    }
}
