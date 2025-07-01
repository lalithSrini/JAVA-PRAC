import java.util.*;

public class logic 
{   
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        System.out.println(a);

        int n = a.length();

        for(int i = n ; i>=0;i--) 
        {
            System.out.println(a.charAt(i - 1));
        }
        
    }
    
}
