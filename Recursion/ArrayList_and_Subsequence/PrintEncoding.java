public class PrintEncoding {
    public static void main(String[] args)
    {
        String input="123";

        encoding(input,"");
    }
    public  static void encoding(String input,String ans)
    {   
        if(input.length()==0)
        {
            System.out.println(ans);
            return;
        }
        else if(input.length()==1)
        {
            int chv=input.charAt(0)-'1';
            String rosl = input.substring(1);
            char codel = (char)((int)'a' + chv);
            encoding(rosl, ans+codel);
            return;
        }
        //code for left branch
        int chv=input.charAt(0)-'1';
        String rosl = input.substring(1);
        char codel = (char)((int)'a' + chv);
        encoding(rosl, ans+codel);
        //code for right branch
        int chr1= input.charAt(0)-'0';
        int chr2 = input.charAt(1)-'0';
        int chr = chr1*10+chr2;
        char coder = (char)((int)'a'+chr-1);
        // System.out.println("coder is "+coder+" chr is"+chr);
        String rosr = input.substring(2);
        encoding(rosr, ans+coder);
    }
}
