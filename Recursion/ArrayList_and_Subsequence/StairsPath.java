import java.util.ArrayList;
import java.util.Scanner;
public class StairsPath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs ");
        int n = sc.nextInt();
        ArrayList<String> res =paths(n);
        System.out.println(res);
        
    }
    public static ArrayList<String> paths(int n)
    {
        if(n==0)
        {
             ArrayList<String> bs = new ArrayList<>();
             bs.add("");
             return bs;
        }
        else if (n<0)
        {
             ArrayList<String> bs = new ArrayList<>();
             return bs;
        }

        ArrayList<String> p1 = paths(n-1);
        ArrayList<String> p2 =paths(n-2);
        ArrayList<String> p3 =paths(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for(String path:p1)
        {
            paths.add("1"+path);
        }
        for(String path:p2)
        {
            paths.add("2"+path);
        }
        for(String path:p3)
        {
            paths.add("3"+path);
        }
        return paths;
    }
}