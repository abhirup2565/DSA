import java.util.ArrayList;
import java.util.Scanner;
public class Keypad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the combination ");
        String str = sc.next();
        String [] arr ={"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".;"};
        ArrayList<String> res = gkp(arr,str);
        System.out.println(res);
        
    }
    public static ArrayList<String> gkp(String [] arr,String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> remain = gkp(arr,ros);
        ArrayList<String> mres = new ArrayList<>();
        for(int i=0;i<arr[(int)ch-'0'].length();i++)
        {
            for(String k: remain)
            {
                mres.add(k+arr[(int)ch-'0'].charAt(i));
            }
        }
        return mres;
    }
}