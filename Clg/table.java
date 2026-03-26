import java.util.*;

public class table 
{
    public static void main(String [] args)
    {
        tab t = new tab();
        t.input();
        t.display();
    }    
}

class tab
{
    int x;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table number : ");
        x = sc.nextInt();
    }
    void display()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(x + " * " + i + " = " + (x*i));
        }
    }
}