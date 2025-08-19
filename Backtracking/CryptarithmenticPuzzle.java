import java.util.*;

public class CryptarithmenticPuzzle {
    public static void main(String[] args) {
        String s1 = "send";
        String s2 = "more";
        String s3 = "money";
        String unique = "sendmory";
        boolean[] used = new boolean[10];
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i = 0; i<unique.length();i++)
        {
            map.put(unique.charAt(i),-1);
            used[i] = false;
        } 

        solveCryptarithmentic(map,unique,used,s1,s2,s3,0);
    }
    public static void solveCryptarithmentic(HashMap <Character,Integer> map,String unique,boolean[]used,String s1,String s2,String s3,int idx)
    {
        if(idx == unique.length())
        {
            int Ints1 = convert(map,s1);
            int Ints2 = convert(map,s2);
            int Ints3 = convert(map,s3);
            if(Ints3 == Ints1+Ints2)
            {
                print(map,unique);
            }
            return;
        }
        for(int i = 0;i<10;i++)
        {
            if(used[i]==false)
            {
                map.put(unique.charAt(idx), i);
                used[i]=true;
                solveCryptarithmentic(map,unique,used,s1,s2,s3,idx+1);
                map.put(unique.charAt(idx), -1);
                used[i]=false;
            }
        }
    }
    public static int convert(HashMap <Character,Integer> map,String s)
    {
        int value = 0;
        for(int i = 0;i<s.length();i++)
        {
            value += map.get(s.charAt(i));
            if(i!=s.length()-1)
            {
                value=value*10;
            }
        }
        return value;
    }
    public static void print(HashMap <Character,Integer> map,String unique)
    {
        for(int i = 0 ;i< unique.length();i++)
        {
            System.out.print(unique.charAt(i)+":"+map.get(unique.charAt(i))+", ");
        }
        System.out.println();
    }
}
