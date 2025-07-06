import java.util.*;
public class AnyBaseMulti {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter First number");
    int num1 = sc.nextInt();
    System.out.println("Enter Second number");
    int num2 = sc.nextInt();
    System.out.println("Both are of base");
    int n = sc.nextInt();
    int answer=0;
    int p=1;
    while(num2>0)
        {
            int n2 =num2%10;
            int add1 = mulSingleDigit(num1,n2,n)*p;
            answer=addition(add1,answer,n);
            num2= num2/10;
            p = p*10;
            System.out.println("add1: "+add1+" ans: "+answer+" num2: "+num2);
        }
    System.out.println(answer);
    }
    
    public static int mulSingleDigit(int num1,int num2,int n)
    {
        int tempMul=0;
        int ans =0;
        int carry = 0;
        int p = 1;
       while(num1>0 || carry>0)
       {
        int n1 =num1%10;
        tempMul=n1*num2+carry;
        ans+= (tempMul%n)*p;
        carry = tempMul/n;
        
        num1=num1/10;
        p=p*10;
       }
       return ans;
    }
 
    
    public static int addition(int num1,int num2,int n)
    {
        int tempAdd = 0;
        int add = 0;
        int carry=0;
        int counter = 1;
        while(num1 > 0 || carry > 0)
        {
            tempAdd=num1%10+num2%10+carry;
            add += (tempAdd%n * counter);
            carry=tempAdd/n;
            System.out.println("Add: "+add+" Tempadd: "+tempAdd+" carry: "+carry);

            counter=counter*10;
            num1 = num1/10;
            num2=num2/10;
            
        }

        return add;
    }

}
