import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class PreInPost{
    public static void main(String[] args) {
        String pre = "";
        String post = "";
        String in = "";
        Integer [] arr = {50,25,12,null,null,37,null,null,75,62,null,null,87,null,null};
        Node root = construct(arr);
        Stack<Pair> st = new Stack<>();
        Pair rootPair = new Pair(root, 1);
        st.add(rootPair);
        while(st.size()>0)
        {
            Pair top = st.peek();
            if(top.state==1)//pre
            {
                pre+=top.node.data+" ";
                if(top.node.left!=null)
                {
                    Pair left = new Pair(top.node.left, 1);
                    st.add(left);
                }
                top.state++;
            }
            else if(top.state==2)//In
            {
                in+=top.node.data+" ";
                if(top.node.right!=null)
                {
                    Pair right = new Pair(top.node.right, 1);
                    st.add(right);
                }
                top.state++;
            }
            else//post
            {
                post+=top.node.data+" ";
                st.pop();
            }
        }
        System.out.println("PRE:"+pre);
        System.out.println("IN:"+in);
        System.out.println("POST:"+post);
        
    }

    public static Node construct(Integer[] arr)
    {
        Node root = new Node(arr[0], null, null);
        Pair rootPair = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rootPair);
        int index = 0;
        while(st.size()>0)
        {
            Pair top = st.peek();
            if(top.state == 1)//left side
            {
                index++;
                if(arr[index]!=null)
                {
                    top.node.left = new Node(arr[index], null, null);
                    Pair leftPair = new Pair(top.node.left, 1);
                    st.push(leftPair);
                }
                else
                {
                    top.node.left = null;
                }
                top.state++;
            }
            else if(top.state == 2)//right side
            {
                index++;
                if(arr[index]!=null)
                {
                    top.node.right = new Node(arr[index], null, null);
                    Pair rightPair = new Pair(top.node.right, 1);
                    st.push(rightPair);
                }
                else
                {
                    top.node.right = null;
                }
                top.state++;
            }
            else{
                st.pop();
            }
        }
        return root;
    }

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    public static class Pair {
        Node node;
        int state;
        Pair(Node node,int state)
        {
            this.node=node;
            this.state=state;
        }
    }
    
}