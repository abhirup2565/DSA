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
            ArrayList<String> bres =new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(sr>=dr || sc>=dc)
        {
            ArrayList<String> bres =new ArrayList<>();
            return bres;
        }
        ArrayList<String>  vpaths =  new ArrayList<>();
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> dpaths = new ArrayList<>();
        if(sc<dc&&sr<dr)
        {
            dpaths=maze(sr+1,sc+1,dr,dc);
        }
        if(sr<dr)
        {
            vpaths=maze(sr+1,sc,dr,dc);
        }
        if(sc<dc)
        {
            hpaths=maze(sr,sc+1,dr,dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath:hpaths)
        {
            paths.add("h"+hpath);
        }
        for(String vpath:vpaths)
        {
            paths.add("v"+vpath);
        }
        for(String dpath:dpaths)
        {
            paths.add("d"+dpath);
        }

        return paths;
    }
}