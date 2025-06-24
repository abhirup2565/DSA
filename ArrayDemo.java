public class ArrayDemo {
    public static void main(String[] args) {
        // int nums[] =new int[4];
        int a[]={8,5,4,3,};
        int b[]={2,4,5,7};
        int c[]={23,54,65,21,32,12};

        //int d[][]={{8,5,4,3,},{2,4,5,7},{23,54,65,21}};
        int d[][]={a,b,c};
        // for(int i =0;i<d.length;i++)
        // {
        //     for(int j =0; j<d[i].length;j++)
        //     {
        //         System.out.print(" "+d[i][j]);
        //     }
           
        //     System.out.println("");
        // }
        

        for(int k[]:d)
        {
            for(int l: k)
            {
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }
}
