import java.util.*;

public class Constructor 
{
    public static void main(String [] args )
    {
        // Declear object of class 
        add a = new add();
        a.display();
    }    
}

// this is class with constructor 
class add
{
    int a,b,sum;

    add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        sc.close();
    }
    void display()
    {
        System.out.println("Sum of a and b is " + sum);
    }
}