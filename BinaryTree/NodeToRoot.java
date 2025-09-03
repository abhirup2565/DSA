import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NodeToRoot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = construct(arr);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        findandPrint(root,target,"");        
    }

    public static void findandPrint(Node node,int target,String path)
    {
        if(node == null)
        {
            return;
        }
        if(node.data == target)
        {
            System.out.println(node.data+","+path);
        }
        findandPrint(node.left, target, node.data+","+path);
        findandPrint(node.right, target, node.data+","+path);
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