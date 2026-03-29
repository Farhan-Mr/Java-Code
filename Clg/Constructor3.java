/* Program of Constructor Overloading */

import java.util.*;

public class Constructor3
{
    public static void main(String [] args)
    {
        // Class Object
        System.out.println("1st Constructor executed"); 
        Add A1 = new Add();

        System.out.println("2nd Constructor executed");
        Add A2 = new Add(40,50);

        System.out.println("3rd Constructor executed");
        Add A3 = new Add(10.50f,10.20f);

        System.out.println("4th Constructor executed");
        Add A4 = new Add(5);
    }
}

class Add
{
    int a,b,sum;
    Add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum is " + sum);
    }

    Add(int a, int b)
    {
        int c,d;
        c = a;
        d = b;
        sum = c+d;
        System.out.println("Sum is " + sum);
    }

    Add(float a, float b)
    {
        float c,d;
        c = a;
        d = b;
        System.out.println("Sum is " + (c+d));
    }

    Add(int d)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        b = d;
        System.out.println("Sum is " + (a+b));
    }
}