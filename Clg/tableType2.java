import java.util.Scanner;

public class tableType2
{
    public static void main(String [] args)
    {
        number obj1 = new number();

        System.out.println("\nTable !\n");
        obj1.Display();
    }
}

class number
{
    int range;
    void Display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range -> ");
        range = sc.nextInt();

            for(int i=1; i<=range; i++)
            {
                for(int j=1; j<=10; j++)
                {
                    System.out.println(i + " * " + j + " = " + (j*i));
                }
                System.out.println("\n");
            }
            sc.close();
    }
}