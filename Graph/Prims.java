import java.util.*;
public class Prims {
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
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(0,-1,0));
        boolean [] visited = new boolean[vertices];
        while (queue.size() > 0) {
            //r m* w a*
            Pair rem = queue.remove();
            if(visited[rem.vertex] == false)
            {
                visited[rem.vertex] = true;
                if(rem.vertex!=-1)
                {
                    System.out.println("["+rem.vertex+"-"+rem.av+"@"+rem.wt+"]");
                }
                for(Edge e: graph[rem.vertex])
                {
                    if(visited[e.nbr]==false)
                    {
                        queue.add(new Pair(e.nbr, rem.vertex,e.wt));
                    }
                }
            }
        }
    }


    static class Pair implements Comparable<Pair>{
        int vertex;
        int av;
        int wt;
        Pair(int vertex,int av,int wt)
        {
            this.vertex = vertex;
            this.av = av;
            this.wt = wt;
        }
        
        public int compareTo(Pair o) {
            return this.wt - o.wt;
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
