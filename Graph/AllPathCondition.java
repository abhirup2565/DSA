import java.util.ArrayList;
import java.util.Scanner;
public class AllPathCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int verices = sc.nextInt();
        System.out.println("Enter the number of edges");
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[verices];
        for(int i = 0; i<verices; i++)
        {
            graph[i] = new ArrayList<>();
        }
        sc.nextLine();
        for(int i = 0; i<edges; i++)
        {
            System.out.println("Enter edges");
            String inputEdges = sc.nextLine();
            String[]parts = inputEdges.split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        System.out.println("Enter the Source");
        int src = sc.nextInt();
        System.out.println("Enter the destination");
        int dst = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ceilthreshold = Integer.MAX_VALUE;
        int floorthreshold = Integer.MAX_VALUE;
        boolean[]visited = new boolean[verices];
        int weight = 0;
        haspath(graph,src,dst,visited,"",min,max,ceilthreshold,floorthreshold);
    }

        public static void haspath(ArrayList<Edge>[]graph,int src,int dst,boolean[]visited,String ans,int min,int max,int ceilthreshold,int floorthreshold,int weight)
        {
            if(src==dst)
            {   
                if(weight<min)
                {
                    min=weight;
                }
                if(weight>max)
                {
                    max = weight;
                }
                if(weight>floorthreshold && weight<40)
                {
                    floorthreshold=weight;
                }
                if(weight<ceilthreshold && weight>40)
                {
                    ceilthreshold=weight;
                }

            }
            visited[src]=true;
            for(Edge edge:graph[src])
            {
                if(visited[edge.nbr]==false)
                {
                    weight += edge.wt;
                    haspath(graph, edge.nbr, dst,visited,ans+String.valueOf(src),min,max,ceilthreshold,floorthreshold,weight);
                    weight -= edge.wt;
                } 
            }
            visited[src]=false;
            return;
        }

    static class Pair implements Comparable<Pair>
    {
        int weight;
        String path;
        
        public Pair(int weight,String path)
        {
            this.weight = weight;
            this.path = path;
        }    
        public int compareTo(Pair o){
            return this.weight - o.weight;
        }
    }


    public static class Edge 
    {
        int src;
        int nbr;
        int wt;
        
        public Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }    
    }
    }
 