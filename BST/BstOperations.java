public class BstOperations {
    public static void main(String[] args) 
    {
        int [] arr = {12,25,37,50,62,75,87};
        Node node = construction(arr,0,arr.length-1);
        int size = size(node);
        int sum = sum(node);
        int min = min(node);
        int max = max(node);
        boolean find = find(node, 12);

        System.out.println("Size:"+size+", Sum:"+sum+", min:"+min+", max:"+max+", find:"+find);
    }

    public static int size(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = size(node.leftNode);
        int right = size(node.rightNode);
        return left+right+1;
    }

    public static int sum(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = sum(node.leftNode);
        int right = sum(node.rightNode);
        return left+right+node.data;
    }

    public static int min(Node node)
    {
        if(node.leftNode==null)
        {
            return node.data;
        }
        int min = min(node.leftNode);
        return min;
    }

    public static int max(Node node)
    {
        if(node.rightNode==null)
        {
            return node.data;
        }
        int max = max(node.rightNode);
        return max;
    }

    public static boolean find(Node node, int find)
    {
        boolean present = false;
        if(node==null)
        {
            return false;
        }
        if(node.data<find)
        {
            present=find(node.rightNode,find);
        }
        else if (node.data>find)
        {
            present=find(node.leftNode,find);
        }
        else if (node.data==find)
        {
            present = true;
        }
        return present;
    }

    public static Node construction(int [] arr, int low, int high)
    {
        if(low>high)
        {
            return null;
        }
        int mid = (low+high)/2;
        Node left = construction(arr, low, mid-1);
        Node right = construction(arr, mid+1, high);
        Node node = new Node(arr[mid], left, right);
        return node;
    }

    public static class Node
    {
        int data;
        Node leftNode;
        Node rightNode;
        public Node(int data, Node leftNode, Node rightNode)
        {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }
}
