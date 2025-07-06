class Animal
{
    void animalShow()
    {
        System.out.println("I am an Animal");
    }
}

class FourLegs extends Animal
{
    void fourShow()
    {
        System.out.println("I have 4 legs");
    }
}

class Dogs extends Animal
{
    void dogShow()
    {
        System.out.println("I am a dog");
    }
}



public class InheritanceDemo {
    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.animalShow();
        obj.dogShow();

        FourLegs obj1= new FourLegs();
        obj1.animalShow();
        obj1.fourShow();
    }
}
