 import java.util.*;
public class BaseToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("Number is of base");
        int n = sc.nextInt();
        System.out.println("Convert it to base of ");
        int n1 = sc.nextInt();
        int numToDecimal= decimalConverter(num,n);

        System.out.println("Number represented in base " +n1+ " as " +baseConverter( numToDecimal ,n1));
    }

    public static int decimalConverter(int num ,int n)
    {
        int ans=0; 
        int counter=0;
        while(num>0)
        {
            int mul =(int)Math.pow(n,counter);
            ans += num%10*mul;
            num= num/10;
            counter++;
        }
        return ans;
    }

    public static int baseConverter(int num ,int n)
    {
        int ans=0; 
        int counter=1;
        while(num>0)
        {
            ans += num%n*counter;
            num= num/n;
            counter= counter*10;
        }
        return ans;
    }
}
