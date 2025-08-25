import java.util.*;
public class Bipartite {
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
        
        int [] visited = new int[vertices];
        Arrays.fill(visited, -1);
        boolean graphBipartite = true;
        //code starts here
        for(int i=0;i<vertices;i++)
        {
            if(visited[i]==-1)
            {
                graphBipartite = isBipartite(graph,visited,i);
                if(!graphBipartite)
                {
                    break;
                }

            }
        }
        System.out.println("It is Bipartite: "+graphBipartite);
    }
        public static boolean isBipartite(ArrayList<Edge>[] graph,int [] visited,int src)
        {
            ArrayDeque<Pair> queue = new ArrayDeque<>();
            queue.add(new Pair(src, src+"",0));
            while (queue.size() > 0) {
            //r m* w a*
            Pair rem = queue.removeFirst();
            if(visited[rem.vertex] == -1)
            {
                visited[rem.vertex] = rem.level;
                System.out.println(rem.vertex +"@"+rem.path);
                for(Edge e: graph[rem.vertex])
                {
                    if(visited[e.nbr]==-1)
                    {
                        queue.add(new Pair(e.nbr, rem.path+e.nbr,rem.level+1));
                    }
                }
            }
            else
            {
                if(rem.level!=visited[rem.level])
                {
                    return false;
                }
                
            }
        }
        return true;
        }


    static class Pair{
        int vertex;
        String path;
        int level;
        Pair(int vertex,String path,int level)
        {
            this.vertex = vertex;
            this.path = path;
            this.level = level;
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
