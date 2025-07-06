import java.util.*;


public class PrimeNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int n = sc.nextInt();
        boolean isPrime[] = sieveOfErastosthenes(n);
        for(int i = 0; i<=n+1; i++)
        {
            System.out.println(i+" is "+isPrime[i]);
        }
    }

    static boolean[] sieveOfErastosthenes(int n){
        boolean isPrime[]= new boolean[n+1];
        Arrays.fill(isPrime,true);
        
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i = 2; i*i <= n;i++)
        {
            for(int j = i*2; j<=n; j+=i)
            {
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}