import java.util.ArrayList;
import java.util.Scanner;
public class PrintPermutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array ");
        String str = sc.next();
        printss(str,"");
        
    }
    public static void printss(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            char ch = ques.charAt(i);
            String ros = ques.substring(0,i)+ques.substring(i+1);
            printss(ros,ans+ch);
        }
    }
        
} 
