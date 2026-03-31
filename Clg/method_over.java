import java.util.*;

public class method_over
{
    public static void main(String [] args)
    {
        // Objects
        maths m1 = new maths();
        m1.rect(10);
    }    
}

class maths
{
    void rect()
    {
        int l , b, ar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        l = sc.nextInt();

        System.out.print("Enter breadth : ");
        b = sc.nextInt();



        ar = l*b;
        System.out.print("Area of rectangle is " + ar);
    }

    void rect(int a)
    {
        int l , b, ar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        l = sc.nextInt();

        b = a;
        ar = l*b;
        System.out.print("Area of rectangle is " + ar);
    }
}