import java.util.*;
public class SmallestNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence");
        String sequence = sc.nextLine();
        int i=0;
        Stack<Integer> st = new Stack<>();
        int num = 1;
        while(i<sequence.length())
        {
            char ch = sequence.charAt(i);
            if(ch == 'd')
            {
                st.push(num);
                num++;
            }
            else
            {
                st.push(num);
                num++;
                while(st.size()>0)
                {
                    System.out.print(st.pop());
                }
            }
            i++;
        }
        st.push(num);
        while(st.size()>0)
        {
            System.out.print(st.pop());
        }
    }
}