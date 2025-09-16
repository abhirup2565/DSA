import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTree{
    public static void main(String[] args) {
        int [] arr = {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
        Node root = constructor(arr);
        levelOrder(root);
    }

     public static void levelOrder(Node node)
    {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(q.size()>0)
        {
            Node first = q.remove();
            System.out.print(first.data+" ");
            for(Node child:first.children)
            {
                q.add(child);
            }
        }
        System.out.print("."); 
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
