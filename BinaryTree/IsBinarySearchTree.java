import java.util.Scanner;
import java.util.Stack;

public class IsBinarySearchTree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = construct(arr);
        print(root);
        BstPair bst = isBST(root);
        System.out.println(bst.isBst);
    }

    public static class BstPair {
        int min;
        int max;
        boolean isBst;
    }

    public static BstPair isBST(Node node)
    {
        if(node==null)
        {
            BstPair bp = new BstPair();
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBst = true;
            return bp;
        }
        BstPair left = isBST(node.left);
        BstPair right = isBST(node.right);
        BstPair mp = new BstPair();
        mp.min = Math.min(node.data,(Math.min(left.min, right.min)));
        mp.max = Math.max(node.data,(Math.max(left.max, right.max)));
        mp.isBst = left.isBst && right.isBst && (node.data>=left.max && node.data<=right.min);
        return mp;
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