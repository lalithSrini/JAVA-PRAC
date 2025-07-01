import java.util.Scanner;

public class function 
{

        // public static void printmySum(int a, int b) 
        // {
        //     int sum = a+b;                                        // function
        //     System.out.println(sum);    
        // }

        // public static void main(String[] args) {
        //     int a = 10;
        //     int b = 20;

        //     printmySum(a, b);   // call the function 
        // }


        // public static int sum(int a,int b)
        // {
        //     int sum = a+b;
        //     return sum;
        // }

        // public static int multipli(int a,int b)
        // {
        //     int sum = a*b;
        //     return sum;
        // }

// FACTORIAL
        public static void  fact(int n)
        {
            if(n<0)
            {
                System.out.println("invalid");

                
            }
            else
            {
                int f = 1;
                for(int i=1;i<=n;i++)
                {
                    f = f * i; 
                }

                System.out.println(f);
            }
            

        }
        
        
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            // System.out.println("Give inputs(a,b):");
            // int a = sc.nextInt();
            // int b = sc.nextInt();

            int n  = sc.nextInt();

            fact(n);
            // System.out.println(sum(a,b));
            // System.out.println(multipli(a, b));
        }
}
