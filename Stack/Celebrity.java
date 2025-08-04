import java.util.*;

class Celebrity {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of candidates");
        int n = sc.nextInt();
        int [][] candidates = new int[n][n]; 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                candidates[i][j] = sc.nextInt();
            }
        }
        findCeleb(candidates);
    }
    public static void findCeleb(int[][] candidates)
    {
        //initializing variables
        Stack <Integer> potentialCeleb = new Stack<>();
        for(int i = 0;i<candidates.length;i++)
        {
            potentialCeleb.add(i);
        }
        while(potentialCeleb.size()>=2)
        {
            int i = potentialCeleb.pop();
            int j = potentialCeleb.pop();

            if(candidates[i][j]==1)//if i knows j
            {
                potentialCeleb.push(j);
            }
            else//i does not know j
            {
                potentialCeleb.push(i);
            }
        }
        int potential = potentialCeleb.pop();
        for(int i=0;i<candidates.length;i++)
        {
            if(i != potential)
            {
                if(candidates[i][potential] == 0 || candidates[potential][i] == 1 )
                {
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println(potential);
    }
}