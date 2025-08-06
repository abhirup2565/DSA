public class DynamicStack {
    public static void main(String [] args)
    {
        CustomStack st = new CustomStack(5);
        st.size();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(5);
        st.push(6);
        st.push(7);
        st.size();
        st.top();
        int pop =st.pop();
        System.out.println("pop "+pop);
        st.size();
    }

    public static class CustomStack{
        int [] cs;
        int tos;
        public CustomStack(int cap)
        {
            cs = new int[cap];
            tos =-1;
        }
        //push
        void push(int x)
        {
            if(tos==cs.length-1)
            {
                int [] newst = new int[2*cs.length];
                for(int i=0;i<cs.length;i++)
                {
                    newst[i]=cs[i];
                }
                cs = newst;
                tos++;
                this.cs[tos]=x;
            }
            else
            {
                tos++;
                this.cs[tos]=x;
            }
        }
        //size
        void size()
        {
            System.out.println(tos+1);
        }
        //display
        void display()
        {
            for(int i=tos;i>=0;i--)
            {
                System.out.print(cs[i]+" ");
            }
            System.out.println("");
        }
        //pop
        int pop()
        {
            if(tos==-1)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
            {
                int value = cs[tos];
                tos--;
                return value;
            }
        }
        //top
        int top()
        {
            if(tos==-1)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
            {
                return cs[tos];
            }
        }
    }
}

