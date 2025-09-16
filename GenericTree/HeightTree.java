import java.util.ArrayList;
import java.util.Stack;

public class HeightTree{
    public static void main(String[] args) {
        int [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = constructor(arr);
        int height = height(root);
        System.out.println(height);
    }

     public static int height(Node node)
    {
        int localHeight = -1;
        for(Node c:node.children)
        {
           int t = height(c);
           localHeight = Math.max(localHeight,t);
        }
        return localHeight+1;
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
