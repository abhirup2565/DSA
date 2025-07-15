import java.util.ArrayList;
import java.util.Scanner;
public class PrintKeypad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        System.out.println("Enter the keys ");
        String str = sc.next();
        printss(arr,str,"");
        
    }
    public static void printss(String []arr,String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        
        int ck = (int)ch-(int)'0';

        for(int i=0;i<arr[ck].length();i++)
        {
            printss(arr,ros,ans+arr[ck].charAt(i));
        }
}
}