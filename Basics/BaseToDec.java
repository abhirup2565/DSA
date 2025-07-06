 import java.util.*;
public class BaseToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the base");
        int n = sc.nextInt();

        System.out.println("Number represented in decimal as "+decimalConverter(num,n));
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
}
