import java.util.*;
public class IsConnected {
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
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        boolean[]visited = new boolean[vertices];
        List<List<Integer>> connected = new ArrayList<>();
        for(int i = 0; i< graph.length;i++)
        {
            if(visited[i]==false)
            {
                List<Integer> connections = new ArrayList<>();
                connected.add(isConnected(graph,i,visited,connections));
            }
        }
        if(connected.size()==1)
        {
            System.out.println("Connected");
        }
        else
        {
            System.out.println("Not Connected");
        }
    }

        public static List<Integer> isConnected(ArrayList<Edge>[]graph,int vertices,boolean[]visited,List<Integer> connected)
        {
            if(visited[vertices]==false)
            {
                visited[vertices]=true;
                connected.add(vertices);
                for(Edge edge:graph[vertices])
                {
                    if(visited[edge.nbr]==false)
                    {
                        isConnected(graph,edge.nbr,visited,connected);
                    } 
                }
            }
            return connected;
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
 