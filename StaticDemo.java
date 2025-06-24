class Emp
{
    int eid;
    int salary ;
    static String ceo;

    static{
        ceo="Larry";
        System.out.println("in static");
    }

    public Emp()
    {
        eid =1;
        salary=2000;
        System.out.println("in costructor");
    }

    public void show()
    {
        System.out.println(eid+" : "+salary+" : "+ceo);
    }
     static{
        ceo="Larry";
        System.out.println("in static");
    }
}

public class StaticDemo {
    public static void main(String[] args)
    {
        Emp navin = new Emp();
        navin.eid=8;
        navin.salary=8000;
        Emp.ceo="Ram";

         Emp rahul = new Emp();
        rahul.eid=4;
        rahul.salary=4000;
        Emp.ceo="Nikita";

        navin.show();
        rahul.show();
    }
}
