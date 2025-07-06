import java.util.Scanner;
public class DsaFibo
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int low = 0;
        int high = 1;
            for(int i=0;i<n;i++)
            {
                System.out.println(low);
                int ans=low+high;
                low =high;
                high = ans;
            }
    }
} 