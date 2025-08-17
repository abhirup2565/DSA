import java.util.*;
public class StackToQueueRemove {
    public static void main(String[] args) {
        CustomQ q = new CustomQ();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.size();
        q.top();
        System.out.println(q.pop());

    }

    public static class CustomQ{
    Stack<Integer> mainQ = new Stack<>();
    Stack<Integer> helperQ = new Stack<>();

    
    //size
    int size()
    {
        return mainQ.size();
    }
    //top
    void top()
    {
        if(mainQ.size()==0)
        {
            System.out.println("stack underflow");
            return;
        }
        System.out.println(mainQ.peek());
        return;
    }
    //size
    int pop()
    {
        if(mainQ.size()==0)
        {
            System.out.println("stack underflow");
            return -1;
        }
        return mainQ.pop();
    }
    //add
    void add(int x)
    {
        if(mainQ.size()==0)
        {
            mainQ.push(x);
            return;
        }
        while(mainQ.size()>0)
        {
            helperQ.add(mainQ.pop());
        }
        mainQ.push(x);
        while(helperQ.size()>0)
        {
            mainQ.add(helperQ.pop());
        }
        return;
    }
}
}