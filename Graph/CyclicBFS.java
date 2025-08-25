import java.util.*;
public class CyclicBFS {
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
        
        boolean [] visited = new boolean[vertices];
        boolean cycle = false;
        //code starts here
        for(int i=0;i<vertices;i++)
        {
            if(visited[i]==false)
            {
                cycle = cyclic(graph,visited,i);
                if(cycle)break;
            }
        }
        System.out.println("it is cyclic"+cycle);
    }
        public static boolean cyclic(ArrayList<Edge>[] graph,boolean [] visited,int src)
        {
            ArrayDeque<Pair> queue = new ArrayDeque<>();
            queue.add(new Pair(src, src+""));
            while (queue.size() > 0) {
            //r m* w a*
            Pair rem = queue.removeFirst();
            if(visited[rem.vertex] == false)
            {
                visited[rem.vertex] = true;
                System.out.println(rem.vertex +"@"+rem.path);
                for(Edge e: graph[rem.vertex])
                {
                    if(visited[e.nbr]==false)
                    {
                        queue.add(new Pair(e.nbr, rem.path+e.nbr));
                    }
                }
            }
            else
            {
                return true;
            }
        }
        return false;
        }


    static class Pair{
        int vertex;
        String path;
        Pair(int vertex,String path)
        {
            this.vertex = vertex;
            this.path = path;
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
