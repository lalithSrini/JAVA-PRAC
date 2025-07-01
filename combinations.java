import java.util.*;
public class combinations {

    static int fact(int n) 
    {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        int p = fact(n) / (fact(n1) * fact(n - n1));

        
        int p1 = fact(m) / (fact(m1) * fact(m - m1));

        System.out.print(p * p1);
    }

}
