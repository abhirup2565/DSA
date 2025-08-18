import java.util.ArrayList;
import java.util.Scanner;
public class customGraph {
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

        print(graph);
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

public static void print(ArrayList<Edge>[] graph)
{
    for(int i=0; i<graph.length;i++)
    {
        for(int j=0; j<graph[i].size();j++)
        {
            System.out.print("Vertex: "+graph[i].get(j).src+", Neighbour: "+graph[i].get(j).nbr+", Weights:"+graph[i].get(j).wt);
        }
        System.out.println();
    }
}
}
 