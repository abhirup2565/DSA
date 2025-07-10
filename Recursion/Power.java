import java.util.*;

public class Power {
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
        return x*pow(x,n-1); 
    }

}