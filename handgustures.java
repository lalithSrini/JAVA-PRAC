
import java.util.Scanner;

public class handgustures {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int c = (n-1)*(n-2)/2;

        System.out.println(c);

    }
}
