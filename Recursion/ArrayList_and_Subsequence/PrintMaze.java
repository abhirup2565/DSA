import java.util.*;
public class PrintMaze{
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
        }
        //moving horizontal
        if(cc<dc)
        {
            printpaths(cr,cc+1,dr,dc, path+"H");
        }
        //moving verical
        if(cr<dr)
        {
            printpaths(cr+1,cc,dr,dc, path+"V");
        }
    }
}
