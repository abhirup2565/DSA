import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class TopologicalSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = sc.nextInt();
        System.out.println("Enter the number of edges");
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for(int i = 0; i<vertices; i++)
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
            graph[v1].add(new Edge(v1, v2));
        }
        boolean [] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<vertices;i++)
        {
            if(visited[i]==false)
            {
                traversal(graph,i,visited,stack);
                stack.push(i);   
            }
        }
        while (stack.size()>0) 
        {
            System.out.println(stack.pop());         
        }
    }

    public static void traversal(ArrayList<Edge>[] graph,int src,boolean[]visited,Stack<Integer> stack)
    {
        visited[src]=true;
        for (Edge edge : graph[src]) {
            if(visited[edge.nbr]==false)
            {
                visited[edge.nbr]=true;
                traversal(graph,edge.nbr,visited,stack);
                stack.push(edge.nbr);
            }
        }
    }

public static class Edge 
{
    int src;
    int nbr;
    
    public Edge(int src,int nbr)
    {
        this.src=src;
        this.nbr=nbr;
    }    
}
}
 