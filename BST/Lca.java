import java.util.Scanner;

class Lca {
    static int sum =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,25,30,37,40,50,60,62,70,75,87};
        Node root = construction(arr,0,arr.length-1);
        display(root);
        System.out.println("Node 1");
        int target1 = sc.nextInt(); 
        System.out.println("Node 2");
        int target2 = sc.nextInt(); 
        int lca = lcaIs(root,target1,target2);
        System.out.println(lca);
    }
    
    public static int lcaIs(Node node,int d1,int d2)
    {
        int lca=-1;
        if(node.data<d1 && node.data<d2)
        {
            lca = lcaIs(node.right, d1, d2);
        }
        else if(node.data>d1 && node.data>d2)
        {
            lca = lcaIs(node.left, d1, d2);
        }
        else
        {
            lca = node.data;
        }
        return lca;
    }
   
    public static class Node
    {
        int data;
        Node right;
        Node left;
        public Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static Node construction(int[]arr,int low,int high)
    {
        if(low>high)
        {
            return null;
        }
        int mid = (low+high)/2;
        Node left = construction(arr, low, mid-1);
        Node right = construction(arr, mid+1, high);
        Node node = new Node(arr[mid],left,right);
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
