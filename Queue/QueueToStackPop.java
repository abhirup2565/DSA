import java.util.*;
public class QueueToStackPop {
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
    Queue<Integer> mainQ = new ArrayDeque<>();
    Queue<Integer> helperQ = new ArrayDeque<>();

    
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
        System.out.println( mainQ.peek());
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
        return mainQ.remove();
    }
    //add
    void add(int x)
    {
        while(mainQ.size()>0)
        {
            helperQ.add(mainQ.remove());
        }
        mainQ.add(x);
        while(helperQ.size()>0)
        {
            mainQ.add(helperQ.remove());
        }
    }
}
}