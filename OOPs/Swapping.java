class Swapping {
    public static class Person{
        int age;
        String name;
    }
    
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.age=25;
        p1.name="Person1";

        Person p2 = new Person();
        p2.age=52;
        p2.name="Person2";
        
        System.out.println("Before: "+p1.age+" this is "+p1.name);
        System.out.println("Before: "+p2.age+" this is "+p2.name);
        swap(p1,p2);
        System.out.println("Before: "+p1.age+" this is "+p1.name);
        System.out.println("Before: "+p2.age+" this is "+p2.name);
    }
    public static void swap(Person p1, Person p2)
    {
        int tempAge=p1.age;
        p1.age=p2.age;
        p2.age=tempAge;

        String tempName=p1.name;
        p1.name=p2.name;
        p2.name=tempName;
    }
    
}
