import java.util.*;

class PostfixConversion {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression");
        String input = sc.nextLine();
        //conversion
        Conversion(input);
    }
    public static void Conversion(String input)
    {
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for(int i = 0; i<input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch == '/' || ch == '*')
            {
               prefixProcess(ch, prefix);
               infixProcess(ch,infix);
            }
            else
            {
                prefix.push(""+ch);
                infix.push(""+ch);
            }
        }
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }

    public static void prefixProcess(char ch, Stack<String> st)
    {
        String v2 = st.pop();
        String v1 = st.pop();
        st.push(ch+v1+v2);
    }
    public static void infixProcess(char ch, Stack<String> st)
    {
        String v2 = st.pop();
        String v1 = st.pop();
        st.push("("+v1+ch+v2+")");
    }
}