import java.util.ArrayList;
import java.util.Scanner;
public class MazeJump{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter  ");
        int sr=0,sc=0;
        int dr=3,dc=3;
        ArrayList<String> res =maze(sr,sc,dr,dc);
        System.out.println(res);
        
    }
    public static ArrayList<String> maze(int sr,int sc,int dr,int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList <String> paths= new ArrayList<>();
        //horizontal moves
        for(int h=1;h<=dc-sc;h++)
        {
            ArrayList<String> hpaths= maze(sr,sc+h,dr,dc);
            for(String hpath: hpaths)
            {
                paths.add("h"+h+hpath);
            }
        }
        //verical moves
        for(int v =1;v<=dr-sr;v++)
        {
            ArrayList<String> vpaths= maze(sr+v,sc,dr,dc);
            for(String vpath: vpaths)
            {
                paths.add("v"+v+vpath);
            }
        }
        // diagonal
        for(int d =1;d<=dr-sr && d<=dc-sc; d++)
        {
            ArrayList<String> dpaths= maze(sr+d,sc+d,dr,dc);
            for(String dpath: dpaths)
            {
                paths.add("d"+d+dpath);
            }
        }

        return paths;
    }
}