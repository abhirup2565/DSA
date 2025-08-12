import java.util.*;
public class PrefixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String input = sc.nextLine();
        conversion(input);
    }
    public static void conversion(String input)
    {
        Queue <String> infix = new ArrayDeque<>();
        Queue <String> postfix = new ArrayDeque<>();  
        Queue <Integer> value = new ArrayDeque<>(); 
        for(int i = input.length()-1; i>=0; i--)
        {
            char ch = input.charAt(i);
            if(ch=='/'||ch=='*'||ch=='+'||ch=='-')
            {
                infixConversion(infix,ch);
                postfixConversion(postfix,ch);
                valueConversion(value,ch);
            }
            else
            {
                infix.add(ch+"");
                postfix.add(ch+"");
                value.add(ch-'0');
            }
        }
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
        System.out.println(value.peek());
    }
    public static void infixConversion(Queue <String> infix,char op)
    {
        String v1 = infix.remove();
        String v2 = infix.remove();
        String operation = "("+v1+op+v2+")";
        infix.add(operation);
    }
    public static void postfixConversion(Queue <String> postfix,char op)
    {
        String v1 = postfix.remove();
        String v2 = postfix.remove();
        String operation = v1+v2+op;
        postfix.add(operation);
    }
    public static void valueConversion(Queue <Integer> value,char op)
    {
        int v1 = value.remove();
        int v2 = value.remove();
        int operation = execution(v1,v2,op);
        value.add(operation);
    }
    public static int execution(int a,int b,char op)
    {
        int ans = 0;
        switch(op)
        {
            case '+':
                ans = a+b;
            break;
            case '-':
            ans = a-b;
            break;
            case '*':
            ans = a*b;
            break;
            case '/':
            ans = a/b;
            break;
        }
        return ans;
    }
}
