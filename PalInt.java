import java.util.*;

public class PalInt {
     public static int rev(int n)
    {
        int a=0;
        while(n>0)
        {
            a=(n%10)+(a*10);
            n=n/10;
        }
        System.out.println("Reversed number is "+ a);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        
        int reverse = rev(num);
        if(reverse==num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    

}
}
