 import java.util.*;
public class BalancedBracket {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean balance=true;
        Stack <Character> bracket = new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='('||input.charAt(i)=='{'||input.charAt(i)=='[')
            {
                 bracket.push(input.charAt(i));
            }
            else if(input.charAt(i)==')'||input.charAt(i)=='}'||input.charAt(i)==']')
            {
                 balance=handleClose(input.charAt(i), bracket);
                 if(balance)
                 {
                    bracket.pop();
                 }
                 else
                 {
                    break;
                 }    
            }
        }
        if(bracket.size()!=0)
        {
            balance=false;
        } 
        System.out.println(balance);  
    }
     public static boolean handleClose(char b, Stack<Character> br)
     {
        switch (b) {
            case ')':
                if(br.peek()!='(')
                {
                    return false;
                }
                break;
            case ']':
                if(br.peek()!='[')
                {
                    return false;
                }
                break;
            case '}':
                if(br.peek()!='{')
                {
                    return false;
                }
                break;
            default:
                System.out.println("invalid operation");
                break;       
        }
        return true;
     }
}
