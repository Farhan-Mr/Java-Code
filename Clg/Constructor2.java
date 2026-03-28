// Constructor overloading example -

public class Constructor2
{
    public static void main(String [] args)
    {
        ABC obj = new ABC();
        // ABC obj = new ABC(10,50);  -> another way to execute construction code 
        ABC obj2 = new ABC("King", "Don");
    }
}

// class 
class ABC
{
    int a = 20;
    int b = 40;

    ABC()
    {
        System.out.println("A is " + a + " and B is " + b);
    }
    ABC(int x, int y)
    {
        a = x; 
        b = y;
        System.out.println("A is " + a + " and B is " + b);
    }
    ABC(String p, String q)
    {
        String m = p; 
        String n = q;
        System.out.println("A is " + m + " and B is " + n);
    }
}