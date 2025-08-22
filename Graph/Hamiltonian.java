import java.util.*;
public class Hamiltonian {
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
        
        hamiltonianPath(graph,0,visited,1,vertices,"");
    }

        public static void hamiltonianPath(ArrayList<Edge>[]graph,int src,boolean[]visited,int hopes,int vertices,String path)
        {
            if(hopes==vertices)
            {
                char ch = '.';
                if(isHamiltonianCycle(graph,src))
                {
                    ch = '*';
                }
                System.out.println(path+src+ch);
                return;
            }

            if(visited[src]==false)
            {
                visited[src]=true;
                for(Edge edge:graph[src])
                {
                    if(visited[edge.nbr]==false)
                    {
                        hamiltonianPath(graph,edge.nbr,visited,hopes+1,vertices,path+src);
                    } 
                }
                visited[src]=false;
            }
        }

        public static boolean isHamiltonianCycle(ArrayList<Edge>[]graph,int src)
        {
            for(Edge edge:graph[src])
            {
                if(edge.nbr==0)
                {
                    return true;
                }
            }
            return false;
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
 