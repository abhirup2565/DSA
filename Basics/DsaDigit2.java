import java.util.*;

public class DsaDigit2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int n =num;
        int count = 0;
        int ans=0;
        while(n!=0)
        {
            count++;
            int pos = (int)Math.pow(10,(n%10)-1);
            ans = ans + (pos*count);
            n=n/10;
        }
        System.out.print(ans);

    }
}
