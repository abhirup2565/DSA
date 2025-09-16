import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTree{
    public static void main(String[] args) {
        int [] arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
        Node root = constructor(arr);
        zigzag(root);
    }

     public static void zigzag(Node node)
    {
        Stack<Node> mq = new Stack<>();
        Stack<Node> cq = new Stack<>();
        int level = 1;
        mq.add(node);
        while(mq.size()>0)
        {
            Node first = mq.pop();
            System.out.print(first.data+" ");
            if(level%2==1)
            {
                for(Node child:first.children)
                {
                    cq.push(child);
                }
            }
            else
            {
                for(int i = first.children.size()-1;i>=0;i--)
                {
                    cq.push(first.children.get(i));
                }
            }
            if(mq.size()==0)
            {
                mq = cq;
                cq = new Stack<>();
                System.out.println();
                level++;
            }
        }  
    }

    public static Node constructor(int[]arr)
    {
        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else
            {
                Node t = new Node();
                t.data = arr[i];
                if(st.size()>0)
                {
                    st.peek().children.add(t);
                }
                else
                {
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
}
