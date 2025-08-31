import java.util.*;
public class RemoveNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,25,37,50,62,75,87};
        Node root = construction(arr,0,arr.length-1);
        display(root);
        System.out.println("Node to be Removed");
        int target = sc.nextInt(); 
        //find node
        Node targetNode = find(root,target); 
        if(targetNode==null)
        {
            System.out.println("target node does not exist in tree");
        }
       display(targetNode);
    }

    public static Node remove(Node targetNode)
    {
        if(targetNode.left==null && targetNode.right == null)
        {
            return null;
        }
        else if (targetNode.left!= null && targetNode.right == null)
        {
            return targetNode.left;
        }
        else if (targetNode.right!= null && targetNode.left == null)
        {
            return targetNode.right;   
        }
        else if (targetNode.right!= null && targetNode.left!= null)
        {
            int leftmax = findLeftMax(targetNode.left);
            System.out.println(leftmax);
            targetNode.data = leftmax;
            targetNode.left  = removeLeftMax(targetNode.left,leftmax);
        }
        return targetNode;
    }
    
    public static Node removeLeftMax(Node node,int max)
    {
        if(node.data == max)
        {
            return null;
        }
        node.right = removeLeftMax(node.right,max);
        return node;
    }

    public static int findLeftMax(Node targetNode)
    {
        if(targetNode.right==null)
        {
            return targetNode.data;
        }
        int leftMax = findLeftMax(targetNode.right);
        return leftMax;
    }

    public static Node find(Node node,int target)
    {
        if(node == null)
        {
            return null;
        }
        if(node.data < target)
        {
            node.right = find(node.right, target);
        }
        else if (node.data > target)
        {
            node.left = find(node.left, target);
        }
        else if(node.data == target)
        {
            node = remove(node);
        }
        return node;
    }


    public static Node construction(int [] arr,int low,int high)
    {
        if(low>high)
        {
            return null;
        }
        int mid = (low+high)/2;
        Node leftNode = construction(arr, low, mid-1);
        Node RightNode = construction(arr, mid+1, high);
        Node node = new Node(arr[mid],leftNode,RightNode);
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

    public static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
