import java.util.*;
public class DuplicateBracket {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean duplicate=false;
        Stack <Character> bracket = new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==')')
            {
                if(bracket.peek()=='(')
                {
                    duplicate=true;
                    break;
                }
                while(bracket.peek()!='(')
                {
                    bracket.pop();
                }
                bracket.pop();
            }
            else{
                bracket.push(input.charAt(i));
            }
            
        } 
        System.out.println(duplicate);  
    }
}
