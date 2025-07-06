class Calc
{
    int num1;
    int num2;
    int result;

    public Calc(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }

}


public class ObjectDemo {
    public static void main(String[] args)
    {
        Calc obj = new Calc(8,7);

        System.out.println(obj.num1+" and "+obj.num2);
        
    }
}
