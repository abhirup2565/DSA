import java.util.Stack;

public class Operations {
    public static void main(String[] args) {
        Integer [] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = construct(arr);
        print(root);
        int sum = sum(root);
        int max = max(root);
        int size = size(root);
        int height = height(root);
        System.out.println("sum:"+sum+", max:"+max+", Size:"+size+", height:"+height);
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

    public static int sum(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        int left = sum(node.left);
        int right = sum(node.right);
        return left+right+node.data;
    }

    public static int max(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }
        int left = max(node.left);
        int right = max(node.right);
        int max = Math.max(node.data,(Math.max(left, right)));
        return max;
    }

    public static int size(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        int left = size(node.left);
        int right = size(node.right);
        int size = Math.max(left, right);
        return size+1;
    }

    public static int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        int left = height(node.left);
        int right = height(node.right);
        int height = Math.max(left, right);
        return height+1;
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