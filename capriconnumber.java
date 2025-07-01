import java.util.Scanner;
public class capriconnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n*n;

        int l = String.valueOf(n1).length();

        int x = n;

        int c = 1;

        while(x > 0){
            c++;
            x = x / 10;
        }

        int p = (int)Math.pow(10, c);
        int q = n1%p;
        int r = n1/p;

        if(q + r == n) {
            System.out.println("kaprikarn Number");
        } else {
            System.out.println("Not a kaprikarn Number");
        }
    }


}
