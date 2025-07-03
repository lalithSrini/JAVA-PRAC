import java.util.*;

public class knapscak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int val[] = new int[n];
        int wt[] = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        float vpk[] = new float[n];

        for (int i = 0; i < n; i++) {
            vpk[i] = (float) val[i] / wt[i];
        }

        boolean visited[] = new boolean[n];
        float p = 0;

        while (k > 0) {
            float max = -1;
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && vpk[i] > max) {
                    max = vpk[i];
                    index = i;
                }
            }

            if (index == -1) break;

            visited[index] = true;
            if (k >= wt[index]) {
                p += val[index];
                k -= wt[index];
            } else {
                p += k * vpk[index];
                break;
            }
        }

        System.out.println("Total value in the knapsack: " + p);
    }
}
