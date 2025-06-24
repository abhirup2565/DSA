class Outer
{
    int a;
    public void show()
    {
        System.out.println("Out display");
    }

    class Inner
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

public class InnerDemo{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
