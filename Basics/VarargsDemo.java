class Varargs{
    void add(int...i)
    {
        int sum = 0;
        for(int k: i)
        {
            sum+=k;
        }
        System.out.println(sum);
    }
}


public class VarargsDemo {
    public static void main(String[] args) {
        Varargs obj  =new Varargs();
        obj.add(3,2,5,3);
    }
}
