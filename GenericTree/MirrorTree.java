import java.util.ArrayList;
import java.util.Stack;

public class MirrorTree{
    public static void main(String[] args) {
        int [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = constructor(arr);
        display(root);
        System.out.println("Mirror");
        Node mirrorRoot = mirror(root);
        display(mirrorRoot);
    }

     public static Node mirror(Node node)
    {
        Node newnode = new Node();
        newnode.data = node.data;
        for(int i = node.children.size()-1;i>=0;i--)
        {
            Node child = mirror(node.children.get(i));
            newnode.children.add(child);
        }
        return newnode;
    }

     public static void display(Node node)
    {
        String str = node.data+"->";
        for(Node c:node.children)
        {
           str+=c.data+",";
        }
        str+=".";
        System.out.println(str);
        for(Node c:node.children)
        {
            display(c);
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
