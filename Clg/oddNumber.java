// WAP to find odd number using class 

import java.util.*;

public class oddNumber
{
    public static void main(String [] args)
    {
        // object -
        oddNum O1 = new oddNum();
        O1.input();
        O1.display();
    }
}

class oddNum
{
    int x;
    void input()
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        x = sc.nextInt();
        sc.close();
    }
    void display()
    {
        if(x%2!=0)
        {
            System.out.print("Odd number");
        }
        else
        {
            System.out.print("Even number");
        }
    }
}