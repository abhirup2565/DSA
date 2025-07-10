import java.util.*;

public class PrintDec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();

        decreasing(n);
    }

    public static void decreasing(int n) {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }
    

}