import java.util.*;
public class AllPathCondition {
    static PriorityQueue <Pair> pq= new PriorityQueue<>();
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int ceilthreshold = Integer.MAX_VALUE;
    static int floorthreshold = Integer.MAX_VALUE;

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
        haspath(graph,src,dst,visited,"",0);
    }

        public static void haspath(ArrayList<Edge>[]graph,int src,int dst,boolean[]visited,String ans,int weight)
        {
            if(src==dst)
            {   
                if(weight<min)
                {
                    min=weight;
                }
                if(weight>max)
                {
                    max = weight;
                }
                if(weight>floorthreshold && weight<40)
                {
                    floorthreshold=weight;
                }
                if(weight<ceilthreshold && weight>40)
                {
                    ceilthreshold=weight;
                }
                if(pq.size()<3)
                {
                    pq.add(new Pair(weight,ans));
                }
                else
                {
                    if(weight>pq.peek().weight)
                    {
                        pq.remove();
                        pq.add(new Pair(weight,ans));
                    }
                }
                return;
            }
            visited[src]=true;
            for(Edge edge:graph[src])
            {
                if(visited[edge.nbr]==false)
                {
                    weight += edge.wt;
                    haspath(graph, edge.nbr, dst,visited,ans+String.valueOf(src),weight);
                    weight -= edge.wt;
                } 
            }
            visited[src]=false;
            return;
        }

    static class Pair implements Comparable<Pair>
    {
        int weight;
        String path;
        
        public Pair(int weight,String path)
        {
            this.weight = weight;
            this.path = path;
        }    
        public int compareTo(Pair o){
            return this.weight - o.weight;
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
 