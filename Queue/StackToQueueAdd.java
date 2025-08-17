import java.util.*;
public class StackToQueueAdd {
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
    void size()
    {
        System.out.println(mainQ.size());
        return ;
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
                t=mainQ.pop();
                helperQ.add(t);
            }
            else{
                helperQ.add(mainQ.pop());
            }
        }
        while(helperQ.size()>0)
        {
            mainQ.add(helperQ.pop());
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
                t=mainQ.pop();
            }
            else{
                helperQ.add(mainQ.pop());
            }
        }
        while(helperQ.size()>0)
        {
            mainQ.add(helperQ.pop());
        }
        System.out.println(t);
        return t;
    }
    //add
    void add(int x)
    {
        mainQ.push(x);   
    }
}
}