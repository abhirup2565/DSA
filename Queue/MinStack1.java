import java.util.*;

public class MinStack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> all = new Stack<>();
        Stack<Integer> min = new Stack<>();
        while (true) {
            System.out.println("Add value to stack");
            int n = sc.nextInt();
            if(n<0)
            {
                break;
            }
            add(all, min, n);
        }
        remove(all, min);
        min(min);
        remove(all, min);
        min(min);
        remove(all, min);
        min(min);
        remove(all, min);
        min(min);
    }
    public static void add(Stack<Integer>all,Stack<Integer>min,int n)
    {
        if(all.size()==0 || all.peek()>n)
        {
            all.push(n);
            min.push(n);
            return;
        }
    }
    public static void remove(Stack<Integer>all,Stack<Integer>min)
    {
        if(all.size()==0)
        {
            System.out.println("empty stack");
            return;
        }
        if(all.peek()==min.peek())
        {
            min.pop();
        }
        all.pop();
        return;
    }
    public static void min(Stack<Integer>min)
    {
        if(min.size()==0)
        {
            System.out.println("empty stack");
            return;
        }
        System.out.println(min.peek());
        return;
    }
}
