import java.util.*;

public class Rotate {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter rotation");
        int k = sc.nextInt();
        int ans = 0;

        //finding digits
        int n=num;
        int digits=0;
        while(n!=0)
        {
            digits++;
            n= n/10;
        }
        System.out.println("Digits are "+digits);

        //optimizing k
        if(k<0)
        {
            k= (k%digits)+digits;
           
        }
        else if(k==0)
        {
            ans=num;
            System.out.println(ans);
        }
        else
        {
            k = (k%digits);
        }
        System.out.println("rotation after optimization is "+k);
        //Rotation
        int left=0;
        for(int i=0;i<k;i++)
        {
            left +=(num%10)*(int)Math.pow(10,i);
            num = num/10;
        }

        left=left*(int)Math.pow(10,digits-k);
        System.out.println(left+"  "+num);
        ans=left+num;
        //Print result
        System.out.println("answer is"+ (ans));
    }
}