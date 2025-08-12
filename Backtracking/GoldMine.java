public class GoldMine {
    public static void main(String[] args) {
        int[][] map ={{10,0,100,200,0,8,0},
                    {20,0,0,0,0,6,0},
                    {30,0,0,9,12,3,4},
                    {40,0,2,5,8,3,11},
                    {0,0,0,0,0,9,0},
                    {5,6,7,0,7,4,2},
                    {8,9,10,0,1,10,8}};
        int score = 0;
        int max = 0;
        for(int i=0;i<map.length;i++)
        {
            for(int j=0;j<map[0].length;j++)
            {
                if(map[i][j]!=0)
                {
                    score = goldrush(map,i,j);
                }
                if(score>max)
                {
                    max=score;
                }
            }
        }
        System.out.println(max);
    }
    public static int goldrush(int [][]map,int row,int col)
    {
        int northGold=0;
        int southGold=0;
        int eastGold = 0;
        int westGold=0;

        if(map[row][col] == 0)
        {
            return 0;
        }
        int present = map[row][col];
        map[row][col]=0;
        //north
        if(row>0)
        {
            northGold = goldrush(map, row-1, col);
        }
        //south
        if(row<map.length-1)
        {
            southGold = goldrush(map, row+1, col);
        }
        //east
        if(col<map[0].length-1)
        {
            eastGold = goldrush(map, row, col+1);
        }
        //west
        if(col>0)
        {
            westGold = goldrush(map, row, col-1);
        }
        int gold = present+northGold+southGold+eastGold+westGold;
        System.out.println("row: "+row+", col: "+col+", Score: "+gold);
        return gold;
    }    
}
