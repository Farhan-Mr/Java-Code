import java.util.*;

public class ageCondition 
{
    public static void main(String [] args)
    {
        age obj = new age();
        obj.input();
        obj.display();
    }    
}

class age
{
    int a;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        a = sc.nextInt();
        sc.close();
    }
    void display()
    {
        if (a >= 18) 
            {
                System.out.println("Elegible for Voting and Driving ");
            }
            else{
                System.out.println("Not Elegible ");
            }
    }
}
