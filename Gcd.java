import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(gcd(n1,n2));
        

    }

    static int gcd(int a,int b)
    {
        //System.out.println("a is  "+a+" b is "+b);
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
}
