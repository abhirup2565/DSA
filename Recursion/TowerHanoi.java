import java.util.*;

public class TowerHanoi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the power");
        int n = sc.nextInt();
        int t1d= sc.nextInt();
        int t2d= sc.nextInt();
        int t3d = sc.nextInt();

        toh(n,t1d,t2d,t3d);
    }

    public static void toh(int n,int t1d, int t2d, int t3d) 
    {
        if(n==0)
        {
            return;
        }
        toh(n-1,t1d,t3d,t2d);
        System.out.println(n+"["+t1d+ "->"+t2d+ "]");
        toh(n-1,t3d,t2d,t1d);
    }

}