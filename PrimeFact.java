import java.util.*;

public class PrimeFact {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int n = num;

        for(int div =2;div*div<n;div++)
        {
            while(n%div == 0)
            {
                n = n/div;
                System.out.println(div);
            }
        }
        if(n!=1)
        {
            System.out.println(n);
        }

    }
}
