import java.util.*;
public class QueueToStackPush {
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
        int t=0;
        while(mainQ.size()>0)
        {
            if(mainQ.size()==1)
            {
                t=mainQ.remove();
                helperQ.add(t);
            }
            else{
                helperQ.add(mainQ.remove());
            }
        }
        while(helperQ.size()>0)
        {
            mainQ.add(helperQ.remove());
        }
        System.out.println(t);
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
        int t=0;
        while(mainQ.size()>0)
        {
            if(mainQ.size()==1)
            {
                t=mainQ.remove();
            }
            else{
                helperQ.add(mainQ.remove());
            }
        }
        while(helperQ.size()>0)
        {
            mainQ.add(helperQ.remove());
        }
        return t;
    }
    //add
    void add(int x)
    {
        mainQ.add(x);
    }
}
}