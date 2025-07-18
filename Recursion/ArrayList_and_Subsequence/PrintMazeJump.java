public class PrintMazeJump{
    public static void main(String [] args)
    {
        int sr=0,sc=0;
        int dr=2,dc=2;
        printpaths(sr,sc,dr,dc, "");
    }
    public static void printpaths(int cr,int cc,int dr,int dc, String path)
    {
        if(cc==dc&&cr==dr)
        {
            System.out.println(path);
            return;
        }
        //moving horizontal
        for(int i=1;i<=dc-cc;i++)
        {
            printpaths(cr,cc+i,dr,dc, path+"H"+i);
        }
        
        //moving verical
        for(int i=1;i<=dr-cr;i++)
        {
            printpaths(cr+i,cc,dr,dc, path+"V"+i);
        }
        //moving diagonal
        for(int i=1,j=1;i<=dr-cr&&j<=dc-cc;i++,j++)
        {
            printpaths(cr+i,cc+j,dr,dc, path+"D"+i);
        }
    }
}
