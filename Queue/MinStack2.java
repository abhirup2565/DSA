import java.util.*;

public class MinStack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> all = new Stack<>();
        int min = 0;
        while (true) {
            System.out.println("Add value to stack");
            int n = sc.nextInt();
            if(n<0)
            {
                break;
            }
            add(all, min, n);
        }
        remove(all);
        min(all,min);
        remove(all);
        min(all,min);
        remove(all);
        min(all,min);
        remove(all);
        min(all,min);
    }
    public static void add(Stack<Integer>all,int min,int n)
    {
        if(n<min)
        {
            all.push(2*n-min);
            min = n;
        }
            all.push(n);
            min = n<min?n:min;
            return;
    }
    public static int min(Stack<Integer>all,int min)
    {
        if(all.size()==0)
        {
            System.out.println("empty stack");
            return -1;
        }
        if(all.peek()<min)
        {
            int value =min;
            min = (2*min)-all.pop();
            return value;
        }
        return all.pop();
    }
    public static int remove(Stack<Integer>all)
    {
        if(all.size()==0)
        {
            System.out.println("empty stack");
            return -1;
        }
        return all.pop();
    }
}
