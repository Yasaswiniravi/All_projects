package oops;
interface Shape 
{
    void draw();
}
class Circle implements Shape 
{
    public void draw()
    {
        System.out.println("Draw Circle");
    }
}
class Square implements Shape
{
    public void draw() 
    {
        System.out.println("Draw Square");
    }
}
public class Interface_demo{
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.draw();  
        s.draw();  
    }
}

