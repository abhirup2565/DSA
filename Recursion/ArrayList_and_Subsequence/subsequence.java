import java.util.ArrayList;
import java.util.Scanner;
public class subsequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array ");
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
        
    }
    public static ArrayList<String> gss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("_");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr:rres)
        {
            mres.add("_"+rstr);
            mres.add(ch+rstr);
        }
        return mres;
    }
}