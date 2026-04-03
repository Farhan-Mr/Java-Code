// program of Multilevel Inheritance 
public class inherit02
{
    public static void main(String [] args )
    {
        // object of class 
        C obj1 = new C();
        obj1.display();
        obj1.display2();
        obj1.display3();
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

class C extends B
{
    public void display3()
    {
        System.out.println("This is Class C");
    }
}