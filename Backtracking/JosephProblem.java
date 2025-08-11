import java.util.*;
public class JosephProblem{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc. nextInt();
        int survivor = joseph(n,k);
        System.out.println(survivor);
    }
    public static int joseph(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        int alive = joseph(n-1, k);
        return (alive+k)%n;
    }
}