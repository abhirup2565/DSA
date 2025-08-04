import java.util.*;

class InfixConversion {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression");
        String input = sc.nextLine();
        //initialising variables
        Stack<Character> operation=new Stack<>(); 
        Stack<String> pre=new Stack<>();
        Stack<String> post=new Stack<>();  
        //logic
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch==')' && operation.size()!=0 )
            {
                while (operation.peek()!='(') 
                {
                    char op = operation.pop();
                    process(op,pre,"pre");
                    process(op,post,"post");
                }
                operation.pop();
            }
            else if(ch=='(')
            {
                operation.push(ch);
            }
            else if(ch=='+' || ch=='-' || ch=='/' || ch=='*')  
            {
                if(operation.size()==0 || precedence(input.charAt(i))>precedence(operation.peek()))
                {
                    operation.push(input.charAt(i));
                }
                else
                {
                    while(operation.size()!=0 && precedence(ch)<precedence(operation.peek()))
                    {
                        char op = operation.pop();
                        process(op,pre,"pre");
                        process(op,post,"post");
                    }
                    operation.push(ch);
                    
                }
            } 
            else
            {
                pre.push(""+ch);
                post.push(""+ch);
            }
        }
        while (operation.size()!=0) 
        {
            char op = operation.pop();
            process(op,pre,"pre");
            process(op,post,"post");
        }
        System.out.println(pre.peek());
        System.out.println(post.peek());
    }

    //precedence
    public static int precedence(char op)
    {
        int precedence=0;
        if(op=='*' || op=='/')
        {
            precedence=2;
        }
        else
        {
            precedence=1;
        }
        return precedence;
    }

    //process
    public static void process(char operation,Stack<String>convert,String op)
    {
        String v2 = convert.pop();
        String v1 = convert.pop();
        String res= result(operation,v1,v2,op);
        convert.push(res);
    }

    //result
    public static String result(char operation,String v1,String v2,String op)
    {
        String res="";
        switch (op) {
            case "pre":
                res = operation+v1+v2;
                break;
            case "post":
                res = v1+v2+operation;
                break;
        }
        return res;
    }
}
