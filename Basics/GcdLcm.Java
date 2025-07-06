import java.util.*;

public class GcdLcm {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        int num1=n1;
        int num2=n2;
        int gcd;
        int lcm;

        //division method for gcd
        while(num1!=0)
        {
            int rem = 0;
            rem=num2 % num1;
            num2=num1;
            num1=rem;
        }
        gcd = num2;

        System.out.println("GCD is "+gcd);

        //lcm
        lcm=n1*n2/gcd;
        System.out.println("LCM is "+lcm);
    }
}