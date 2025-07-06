import java.util.*;
public class AnyBaseSubstraction {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter bigger First number");
    int num1 = sc.nextInt();
    System.out.println("Enter Second number");
    int num2 = sc.nextInt();
    System.out.println("Both are of base");
    int n1 = sc.nextInt();
    System.out.println(substraction(num1,num2,n1));
    }

    public static int substraction(int num1,int num2,int n)
    {
        int tempSub = 0;
        int sub = 0;
        int carry=0;
        int counter = 1;
        while(num1 > 0 && num2 > 0)
        {
            tempSub=num1%10-num2%10+carry;
            carry=0;
            if(tempSub<0)
            {
             tempSub+=n;
             carry=-1;   
            }

            sub += (tempSub * counter);
            
            System.out.println("Sub: "+sub+" Tempsub: "+tempSub+" carry: "+carry);

            counter=counter*10;
            num1 = num1/10;
            num2=num2/10;
        }
        
        return sub;
    }

}
