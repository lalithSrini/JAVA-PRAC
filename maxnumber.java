// import java.util.*;

// public class maxnumber{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int[] a = {7,8,6,4,7,2,3,8,9,0};

//         List<Integer> list = new ArrayList<>();

//         for(int i=0;i<String.valueOf(n).length();i++) 
//         {
//             while(n>0)
//             {
//                 list.add(n % 10);
//                 n /= 10;
//             }
//         }
            
        
//         for(int i=0;i<list.size();i++)
//         {
//             int c = list.get(i);
//             if(c < a[c]){
//                 list.set(i, a[c]);
//             }
//         }
//         Collections.reverse(list);
        
//         // System.out.println(list);

//         StringBuilder result = new StringBuilder();
//         for (int d : list) {
//             result.append(d);
//         }

//         System.out.println(result.toString());
//     }
// }


import java.util.*;

public class maxnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = {7, 8, 6, 4, 7, 2, 3, 8, 9, 0};

        int result = 0;

        while (n > 0) {
            int digit = n % 10;
            int d = (digit < a[digit]) ? a[digit] : digit;
            result = result * 10 + d;
            n /= 10; 
        }

        int finalResult = 0;
        while (result > 0) {
            finalResult = finalResult * 10 + result % 10;
            result /= 10;
        }

        System.out.println(finalResult);
    }
}
