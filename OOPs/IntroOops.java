class IntroOops {
    public static class Person{
        int age;
        String name;

        public void says()
        {
            System.out.println(name+" age is "+age+", He says HI!");
        }
    }
    
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.age=25;
        p1.name="hello";
        p1.says();
    }
    
}
