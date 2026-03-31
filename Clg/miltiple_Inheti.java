public class miltiple_Inheti
{
    public static void main(String [] args )
    {
        // object of class 
        D object = new D();
        object.display();
        object.display2();
        object.display3();
        object.display4();
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

interface C
{
    public void display3();
}

class D extends B implements C
{
    public void display4()
    {
        System.out.println("This is Class D");
    }
    public void display3()
    {
        System.out.println("This is Interface C");
    }
}