import java.util.*;
public class ConnectedComponent {
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
            List<Integer> connections = new ArrayList<>();
            connected.add(isConnected(graph,i,visited,connections));
        }
        print(connected);  
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

        public static void print (List<List<Integer>> connections)
        {
            for(List<Integer>connection: connections)
            {
                if(connection.size()==0)
                {
                    continue;
                }
                System.out.print("{");
                for(int i = 0;i< connection.size();i++)
                {
                    System.out.print(connection.get(i));
                }
                System.out.print("},");
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
 