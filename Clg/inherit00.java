// program of Single Inheritance 
public class inherit00 
{
    public static void main(String [] args )
    {
        // object of class 
        B obj1 = new B();
        obj1.display();
        obj1.display2();
    }    
}

class A
{
    public void display()
    {
        System.out.println("This is Class A");
    }
}

class B extends A
{
    public void display2()
    {
        System.out.println("This is Class B");
    }
}

