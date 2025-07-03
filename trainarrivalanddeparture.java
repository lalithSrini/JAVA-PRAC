import java.util.*;
public class trainarrivalanddeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arrival = new int[n];
        int[] departure = new int[n];

        for(int i=0;i<arrival.length;i++) {
            arrival[i] = sc.nextInt();
        }

        for(int i=0;i<departure.length;i++) {
            departure[i] = sc.nextInt();
        }

        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform = 0;
        int currentTrains = 0;
        int i = 0, j = 0;
        while(i < n && j < n) 
        {
        
            if(arrival[i] <= departure[j]) {
                currentTrains++;
                platform = Math.max(platform, currentTrains);
                i++;
            } else {
                currentTrains--;
                j++;
            }
        }
        System.out.println(platform);
    }
}
