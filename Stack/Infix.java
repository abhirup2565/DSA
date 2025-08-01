import java.util.*;

class Infix {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression");
        String input = sc.nextLine();
        
        //initializing variable
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i=0; i<input.length(); i++)
        {
            
            if(input.charAt(i)== '(')
            {
                    operator.push(input.charAt(i));
            }
            else if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='/' || input.charAt(i)=='*' || input.charAt(i)==')')
            {
                if(input.charAt(i)== ')')
                {
                    while (operator.peek()!='(') {
                        char operate=operator.pop();
                        int v2 = operand.pop();
                        int v1 = operand.pop();
                        int result=calculate(operate,v1,v2);
                        operand.push(result);
                    }
                    operator.pop();
                }
                else if(operator.size()== 0 || precedence(input.charAt(i))>precedence(operator.peek()) )
                {
                    operator.push(input.charAt(i));
                }
                else
                {
                    while (operator.size()>0 && precedence(input.charAt(i))<=precedence(operator.peek()) ) 
                    {
                        char operate=operator.pop();
                        int v2 = operand.pop();
                        int v1 = operand.pop();
                        int result=calculate(operate,v1,v2);
                        operand.push(result);
                    }
                    operator.push(input.charAt(i));
                }
            }
            else
            {
                operand.push(input.charAt(i)-'0');
            } 
        }
        while (operator.size()>0 ) 
                    {
                        char operate=operator.pop();
                        int v2 = operand.pop();
                        int v1 = operand.pop();
                        int result=calculate(operate,v1,v2);
                        operand.push(result);
                    }
        System.out.println(operand.peek());
    }

    public static int precedence(char ch)
    {
     if(ch=='/'||ch=='*')
     {  
        return 2;
     }
     else
     {
        return 1;
     }
    }
   
    public static int calculate(char ch,int v1,int v2)
    {
     int result=0;
     switch (ch) 
        {
            case '+':
                result=v1+v2;
                break;
            case '-':
                result=v1-v2;
                break;
            case '/':
                result=v1/v2;
                break;
            case '*':
                result=v1*v2;
                break;
        }
     return result;
    }
}


