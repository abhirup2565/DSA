import java.util.*;
public class SearchSorted{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();
        int[] [] arr= new int[r][c];
        System.out.println("Enter the value");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++) 
            {
                arr[i][j]=sc.nextInt();
            }    
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();

        int row = row(arr,target);
        int col=col(arr,row,target);

        if(col==-1)
        {
            System.out.println("element not present");
        }
        else
        {
            System.out.println("element present at row "+row+" cloumn "+col);
        }



    }

    //binary search on rows: returns row of item
    public static int row(int [][]arr,int target)
    {
        int start =0;
        int end =arr.length;
        int mid =0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(target<arr[mid][0])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return mid;
    }

    public static int col(int [][]arr,int row,int target)
    {
        int start=0;
        int end =arr[0].length;
        int mid =0;
        while(start<=end)
        {
             mid=(start+end)/2;
            if(target==arr[row][mid])
            {
                return mid;
            }
            else if(target<arr[row][mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}