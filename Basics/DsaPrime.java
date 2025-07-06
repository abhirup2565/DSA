import java.util.Scanner; 
public class DsaPrime{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower bound");
        int low = sc.nextInt();
        System.out.println("Enter higher bound");
        int high = sc.nextInt();
        for(int i = low; i<=high;i++)
        {
            int count = 0;
            for (int div = 2; div*div <= i; div++)
            {
                if(i%div == 0)
                count ++;
                break;
            }
        if (count == 0)
        {
            System.out.println(i+" is a prime");
        }
        else
        {
            System.out.println(i+"is not a prime");
        }
    }
}
    
}
