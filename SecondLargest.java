import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class SecondLargest
{
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 numbers: ");
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }


        Arrays.sort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));
        if(arr[arr.length-1] == arr[arr.length-2])
        {
            System.out.println(arr[arr.length-3]);
        }
        else
        {
            System.out.println("Second largest number is: " + arr[arr.length - 2]);
        }

    }
}