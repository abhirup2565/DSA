class Animal
{
    public Animal()
    {
        System.out.println("I am in Animal");
    }
    public Animal(int i)
    {
        System.out.println("I am in Integer Animal");
    }
}

class Dogs extends Animal
{
    public Dogs()
    {
        super(5);
        System.out.println("I am in dog");
    }
    public Dogs(int i)
    {
        super(i);
        System.out.println("I am in Integer dog");
    }
}



public class SuperMethod {
    public static void main(String[] args) {
        Dogs obj = new Dogs();
    }
}