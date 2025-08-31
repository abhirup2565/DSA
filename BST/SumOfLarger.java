class SumOfLarger {
    static int sum =0;
    public static void main(String[] args) {
        int [] arr = {12,25,37,50,62,75,87};
        Node root = construction(arr,0,arr.length-1);
        display(root);
        Node sum = sumLarger(root);
        display(sum);
    }
    
    public static Node sumLarger(Node node)
    {
        if(node.right==null && node.left==null)
        {
            int t = node.data;
            node.data = sum;
            sum+=t;
            return node;
        }
        //Right side
        node.right = sumLarger(node.right);
        //node
        int t = node.data;
        node.data = sum;
        sum+=t;
        //Left side
        node.left = sumLarger(node.left);
        return node;
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
