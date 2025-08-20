import java.util.ArrayList;
import java.util.Scanner;
public class DFS {
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
        boolean[]visited = new boolean[verices];
        boolean path = haspath(graph,src,dst,visited);
        System.out.println(path);
    }

        public static boolean haspath(ArrayList<Edge>[]graph,int src,int dst,boolean[]visited)
        {
            if(src==dst)
            {
                return true;
            }
            visited[src]=true;
            for(Edge edge:graph[src])
            {
                if(visited[edge.nbr]==false)
                {
                    boolean hasNbrPath = haspath(graph, edge.nbr, dst,visited);
                if(hasNbrPath == true)
                {
                    return true;
                }
                } 
            }
            visited[src]=false;
            return false;
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
 