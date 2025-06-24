import java.util.*;
public class DigitFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sequence");
        int num = sc.nextInt();
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println("frequency of number is "+freq(num,n));
    }

    public static int freq(int num ,int n)
    {
        int ans=0; 
        while(num>0)
        {
            if(num%10==n)
            {
                ans++;
            }
            num= num/10;
        }
        return ans;
    }
}
