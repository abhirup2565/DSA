import java.util.Scanner;

public class FriendPairing {
    static int counter = 1;
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);   
        System.out.println("enter the number");
        int n = sc.nextInt();
        boolean [] used = new boolean[n+1];
        solutions(1, n, used, "");
    }
    public static void solutions(int i,int n,boolean[] used, String asf)
    {
        if(i>n)
        {
            System.out.println(counter+"."+asf);
            counter++;
            return;
        }
        if(used[i]==true)
        {
            solutions(i+1, n, used, asf);
        }
        else
        {
            used[i] = true;
            solutions(i+1, n, used, asf+"("+i+")");
            for(int j = i+1;j<=n;j++)
            {
                if(used[j]==false)
                {
                    used[j] = true;
                    solutions(i+1, n, used, asf+"("+i+j+")");
                    used[j]=false;
                }
            }
            used[i] = false;
        }
        
    }
}
