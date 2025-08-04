import java.util.*;

class MergeOverlapping {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of meetings");
        int n = sc.nextInt();
        int [][] candidates = new int[n][2]; 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                candidates[i][j] = sc.nextInt();
            }
        }
        MergeOverlappingIntervals(candidates);
    }

    public static void MergeOverlappingIntervals(int[][] arr)
    {
        //merge overlapping and print in increasing order of start
        Pair [] pairs = new Pair[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        } 
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i<pairs.length; i++)
        {
            if(i==0)
            {
                st.push(pairs[i]);
            }
            else
            {
                Pair top = st.peek();
                if(pairs[i].startTime > top.endTime)
                {
                    st.push(pairs[i]);
                } 
                else
                {
                    top.endTime = Math.max(top.endTime, pairs[i].endTime);
                }
            }
        }
        Stack <Pair> rs = new Stack<>();
        while(st.size()>0)
        {
            rs.push(st.pop());
        }
        while(rs.size()>0)
        {
            Pair p = rs.pop();
            System.out.println(p.startTime+" "+p.endTime);
        }  
    }

    public static class Pair implements Comparable<Pair>
    {
        int startTime;
        int endTime;

        Pair(int st, int et)
        {
            this.startTime = st;
            this.endTime = et;
        }

        public int compareTo(Pair other)
        {
            if(this.startTime != other.startTime)
            {
                return this.startTime-other.startTime;
            }
            else{
                return this.endTime - other.endTime;
            }
        }
    }
}