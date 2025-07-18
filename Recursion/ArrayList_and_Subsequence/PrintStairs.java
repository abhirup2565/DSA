import java.util.*;
public class PrintStairs {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stairs");
        int n = sc.nextInt();
        printpaths(n, "");
    }
    public static void printpaths(int n, String path)
    {
        if(n==0)
        {
            System.out.println(path);
            return;
        }
        else if(n<0)
        {
            return;
        }
        //for jump 1
        printpaths( n-1, path+"1");
        //for jump 2
        printpaths( n-2, path+"2");
        //for jump 3
        printpaths( n-3, path+"3");
    }
}
