import java.util.*;
public class PythoTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the triplets");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int hypo;
        //finding max
        if(num1>=num2&&num1>=num3)
        {
            hypo=num1;
        }
        else if (num2>=num2&&num2>=num3)
        {
            hypo = num2;
        }
        else
        {
            hypo = num3;
        }
        //evaluating

        int lhs = (int)Math.pow((num1+num2+num3-hypo),2)-(2*num1*num2*num3/hypo); 
        int rhs = hypo*hypo;
        if(lhs==rhs)
        {
            System.out.println("triplet");
        }
        else
        {
            System.out.println("not");
        }
    }
}
