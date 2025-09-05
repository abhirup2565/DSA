import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class LevelFar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] arr = {50,25,12,null,null,37,30,null,null,40,null,null,75,62,60,null,null,70,null,null,87,null,null};
        Node root = construct(arr);
        System.out.println("Enter the value");
        int data = sc.nextInt();
        System.out.println("Enter the distance");
        int k = sc.nextInt();
        printKNodeFar(root,data,k);
    }

    public static void printKNodeFar(Node node,int data ,int k)
    {
        path = new ArrayList<>();
        boolean possible = findandPrint(node, data);
        if(!possible)
        {
            System.out.println("data does not exist");
            return;
        }
        for(int i = 0;i<path.size();i++)
        {
            printKLevelDown(path.get(i), k-i,i==0?null:path.get(i-1));
        }

    }

    public static void printKLevelDown(Node node , int k,Node block)
    {
        if(node==null||k<0||node==block)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(node.data+",");
            return;
        }
        printKLevelDown(node.left, k-1,block);
        printKLevelDown(node.right, k-1,block);
    }

    static ArrayList<Node> path;
    public static boolean findandPrint(Node node,int target)
    {
        if(node == null)
        {
            return false;
        }
        if(node.data == target)
        {
            path.add(node);
            return true;
        }
        boolean findleft = findandPrint(node.left, target);
        if(findleft)
        {
            path.add(node);
            return true;
        }
        boolean findright = findandPrint(node.right, target);
        if(findright)
        {
            path.add(node);
            return true;
        }
        return false;
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