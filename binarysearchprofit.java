import java.util.*;

public class binarysearchprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int l = 0, r = n - 1;

        int i = 1;
        int p = 0;
        while(l<=r){
            if(arr[l] < arr[r]){
                p = p + arr[l]*i;
                l++;
                i++;
            }
            else{
                p = p + arr[r]*i;
                r--;
                i++;
            }
        }

        


        System.out.println(p);
           
    }
}
