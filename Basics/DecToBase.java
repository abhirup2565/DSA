
    import java.util.*;
    public class DecToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the base");
        int n = sc.nextInt();

        System.out.println("Number represented in base "+n+" is equal to "+baseConverter(num,n));
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

    

