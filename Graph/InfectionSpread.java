import java.util.*;
public class InfectionSpread {
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
        System.out.println("Enter level");
        int level = sc.nextInt();
        boolean [] infected = new boolean[vertices];
        //code starts here
        infection(graph,infected,src,level);
    }
    public static void infection(ArrayList<Edge>[] graph,boolean [] infected,int src,int level)
    {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, src+"",0));
        String infectedNodes = "";
        while (queue.size() > 0) 
        {
            //r m* w a*
            Pair rem = queue.removeFirst();
            if(rem.level>level)
            {
                System.out.println("infected are "+infectedNodes);
                return;
            }
            if(infected[rem.vertex] == false)
            {
                infected[rem.vertex] = true;
                infectedNodes+= rem.vertex+",";
                for(Edge e: graph[rem.vertex])
                {
                    if(infected[e.nbr]==false)
                    {
                        queue.add(new Pair(e.nbr, rem.path+e.nbr,rem.level+1));
                    }
                }
            }
        }
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
