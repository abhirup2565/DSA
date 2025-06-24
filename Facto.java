import java.util.*;
public class Facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int ans=1;
        if(num>0)
        {
            for(int i = 1; i<=num; i++)
            {
            ans= ans*i;
            }
        }
        System.out.print(ans);

}
}