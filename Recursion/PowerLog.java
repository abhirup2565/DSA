import java.util.*;

public class PowerLog {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the power");
        int n= sc.nextInt();
        System.out.println("enter the  base number");
        int x= sc.nextInt();

        System.out.println(pow(x,n));
    }

    public static int pow(int x,int n) {
        if(n==0)
        {
            return 1;
        } 
        int xb2=pow(x,n/2);
        if(n%2==1)
        {
            
            return x*xb2*xb2; 
        }
        else
        {
            return xb2*xb2;
        }
        
    }

}