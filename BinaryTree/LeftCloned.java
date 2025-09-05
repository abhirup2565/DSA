import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class LeftCloned{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] arr = {50,25,12,null,null,37,30,null,null,40,null,null,75,62,60,null,null,78,null,null,87,null,null};
        Node root = construct(arr);
        print(root);
        Node leftClone = clone(root);
        print(leftClone);        
    }

    public static void print(Node node)
    {
        if(node==null)
        {
            return;
        }
        String str = "";
        str+= node.left==null?".":node.left.data;
        str+="<-"+node.data+"->";
        str+=node.right==null?".":node.right.data;
        System.out.println(str);
        print(node.left);
        print (node.right);
    }

    public static Node clone(Node node)
    {
        if(node==null)
        {
            return null;
        }
        Node leftClone = clone(node.left);
        Node rightClone = clone(node.right);
        node.right = rightClone;
        node.left = new Node(node.data, leftClone, null);
        return node;
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