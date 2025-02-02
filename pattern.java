import java.util.Scanner;

public class pattern
{
    public static void main(String[] args) 
    {

    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");

        int n = sc.nextInt();


// *****
// *****
// *****
// *****
// *****


        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


// *****
// *   *
// *   *
// *   *
// *****

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==0 || i == n-1  || j == 0 || j == n-1)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }

// *
// **
// ***
// ****
// *****

        

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j =1 ; j<=i ; j++) 
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

//    * 
//   * * 
//  * * * 
// * * * * 


        // for(int i=0;i<n;i++)
        // {
        //     for(int j =0 ; j< n-i-1 ; j++) 
        //     {
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }


// *****
// ****
// ***
// **
// *
        
        // for(int i=n-1;i>=0;i--)                    //for(int i=n;i>0;i--)
        //  {
        //     for(int j =i ; j>=0 ; j--)        // for(int j=i;j>0;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


//      *
//     **
//    ***
//   ****

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n-i;j>0;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1 ;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

// 1
// 12
// 123
// 1234
// 12345

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


// 12345
// 1234
// 123
// 12
// 1

        // for(int i=n;i>0;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print (num+" ");
             num++;
            }
            System.out.println();
        }
 


    }
}