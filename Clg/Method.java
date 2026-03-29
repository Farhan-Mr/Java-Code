import java.util.*;

public class Method
{
    public static void main(String [] args)
    {
        // Objects
        Maths M1 = new Maths();
        M1.square();
    }    
}

class Maths
{
    void square()
    {
        int s, Ar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square in : ");
        s = sc.nextInt();

        Ar = s*s;
        System.out.print("Area of square is " + Ar);
    }
}