import java.util.*;
public class abbreviation {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        //Abbreviation function
        computeAbbreviation(input,"",0);
    }
    public static void computeAbbreviation(String input,String abbre,int notappearing)
    {
        int counter = notappearing;
        if(input=="")
        {
            if(counter!=0)
            {

                abbre=abbre+Integer.toString(counter);
            }
            System.out.println(abbre);
            return;
        }
        char ch = input.charAt(0);
        String ros = input.substring(1);
        computeAbbreviation(ros,abbre,++counter);
        counter--;
        if(counter!=0)
        {
        computeAbbreviation(ros,abbre+counter+ch,0);
        }
        else
        {
        computeAbbreviation(ros,abbre+ch,0);
        }
    }
}
