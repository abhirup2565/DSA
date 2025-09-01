import java.util.Scanner;

public class PrintRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,25,30,37,40,50,60,62,70,75,87};
        Node root = construction(arr,0,arr.length-1);
        display(root);
        System.out.println("Starting Range");
        int start = sc.nextInt(); 
        System.out.println("Ending Range");
        int end = sc.nextInt(); 
        print(root,start,end);
    }

    public static void print(Node node,int start,int end)
    {
        if(node==null)
        {
            return;
        }
        if(node.data>start && node.data<end)
        {
            print(node.left, start, end);
            System.out.println(node.data);
            print(node.right, start, end);
        }
        else if(node.data<=start)
        {
            //right
            print(node.right, start, end);
        }
        else if(node.data>=end)
        {
            //left
            print(node.left, start, end);
        }
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
