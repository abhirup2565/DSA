import java.util.*;

public class DsaDigit {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int digits=0;
        int divisor=1;
        //number of digit
        int n = num;
        while(n!=0)
        {
            n=n/10;
            digits++;
        }
        //finding divisor
            divisor=(int)Math.pow(10,digits-1);
        
        //operations
        n=num;
        while(divisor>=1)
        {
            System.out.println(n/divisor);
            n= n%divisor;
            divisor = divisor/10;
        }
        
    }
}
