import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter First number");
    int num1 = sc.nextInt();
    System.out.println("Enter Second number");
    int num2 = sc.nextInt();
    System.out.println("Both are of base");
    int n1 = sc.nextInt();
    System.out.println(addition(num1,num2,n1));
    }

    public static int addition(int num1,int num2,int n)
    {
        int tempAdd = 0;
        int add = 0;
        int carry=0;
        int counter = 1;
        while(num1 > 0 && num2 > 0)
        {
            tempAdd=num1%10+num2%10+carry;
            add += (tempAdd%n * counter);
            carry=tempAdd/n;
            System.out.println("Add: "+add+" Tempadd: "+tempAdd+" carry: "+carry);

            counter=counter*10;
            num1 = num1/10;
            num2=num2/10;
        }
        if(carry!=0)
        {
            add += (carry * counter);
        }
        
        return add;
    }

}
