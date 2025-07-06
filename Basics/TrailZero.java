import java.util.*;
public class TrailZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int ans=0;
        int n=5;
        while(num/n>0)
        {
            ans= ans + num/n;
            n=n*5;
        }
        System.out.println("Trailing zeros are "+ans);
    }
}
