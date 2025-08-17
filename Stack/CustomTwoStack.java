public class CustomTwoStack{
    public static void main(String [] args)
    {
        CustomStack st = new CustomStack(5);
        
        st.push1(5);
        st.push2(6);
        st.push1(7);
        st.size1();
        st.size2();
        st.top1();
        st.top2();
        int pop1 =st.pop1();
        System.out.println("pop "+pop1);
        int pop2 =st.pop2();
        st.size1();
        System.out.println("pop "+pop2);
        st.size2();
    }

    public static class CustomStack{
        int [] cs;
        int tos1;
        int tos2;
        public CustomStack(int cap)
        {
            cs = new int[cap];
            tos1 =-1;
            tos2 = cap;
        }
        //push
        void push1(int x)
        {
            tos1++;
            if(tos1>=tos2)
            {
                System.out.println("Stack overflow");
                return;
            } 
            this.cs[tos1]=x;
        }
        void push2(int x)
        {
            tos2--;
            if(tos1>=tos2)
            {
                System.out.println("Stack overflow");
                return;
            } 
            this.cs[tos2]=x;
        }
        //size
        void size1()
        {
            System.out.println(tos1+1);
        }
         void size2()
        {
            System.out.println(cs.length-tos2);
        }
        //display
        void display1()
        {
            for(int i=tos1;i>=0;i--)
            {
                System.out.print(cs[i]+" ");
            }
            System.out.println("");
        }
        void display2()
        {
            for(int i=tos2;i<cs.length;i++)
            {
                System.out.print(cs[i]+" ");
            }
            System.out.println("");
        }
        //pop
        int pop1()
        {
            if(tos1==-1)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
            {
                int value = cs[tos1];
                tos1--;
                return value;
            }
        }
        int pop2()
        {
            if(tos2==cs.length)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
            {
                int value = cs[tos2];
                tos2++;
                return value;
            }
        }
        //top
        int top1()
        {
            if(tos1==-1)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
            {
                return cs[tos1];
            }
        }
        int top2()
        {
            if(tos1==cs.length)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
            {
                return cs[tos2];
            }
        }
    }
}
