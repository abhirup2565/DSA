import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,25,30,37,40,50,60,62,70,75,87};
        Node root = construction(arr,0,arr.length-1);
        display(root);
        System.out.println("Enter the Target Number");
        int target = sc.nextInt(); 
        traversal(root,root,target);
    }

    public static void traversal(Node root,Node node,int target)
    {
        if(node==null)
        {
            return;
        }
        traversal(root, node.left, target);
        int comp = target - node.data;
        if(node.data<comp)
        {
            if(find(root,comp)==true)
            {
                System.out.println(node.data+" "+comp);
            }
        }
        traversal(root, node.right, target);
    }

    public static boolean find(Node node,int comp)
    {
        boolean ret=false;
        if(node==null)
        {
            return false;
        }
        if(comp>node.data)
        {
            ret = find(node.right, comp);
        }
        else if (node.data>comp)
        {
            ret = find(node.left, comp);
        }
        else
        {
            ret = true;
        }
        return ret;
    }

    public static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data,Node left,Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    public static Node construction(int []arr,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid = (start+end)/2;
        Node left = construction(arr, start, mid-1);
        Node right = construction(arr, mid+1, end);
        Node node = new Node(arr[mid], left, right);
        return node;
    }

    public static void display(Node node)
    {
        if(node==null)
        {
            return;
        }
        String str = "";
        str+=node.left==null?".":node.left.data;
        str+="<-"+node.data+"->";
        str+=node.right==null?".":node.right.data;
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
}
