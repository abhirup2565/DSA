import java.util.*;
public class IterativeDfs {
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
        System.out.println("Enter Source");
        int src = sc.nextInt();
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(src, src+""));
        boolean [] visited = new boolean[vertices];
        while (st.size() > 0) {
            //r m* w a*
            Pair rem = st.pop();
            if(visited[rem.vertex] == false)
            {
                visited[rem.vertex] = true;
                System.out.println(rem.vertex +"@"+rem.path);
                for(Edge e: graph[rem.vertex])
                {
                    if(visited[e.nbr]==false)
                    {
                        st.push(new Pair(e.nbr, rem.path+e.nbr));
                    }
                }
            }
        }
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
