//Write a Java program to create an interface Shape with the getArea() method.
interface Shape{
    void getArea();
}
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.Implement the getArea() method for each of the three classes.
class Rectangle implements Shape{
    public void getArea(){
        System.out.println("Method Called Successfully");
    }
}
class Circle implements Shape{
    public void getArea(){
        System.out.println("Method Called Successfully");
    }
}
class Triangle implements Shape{
    public void getArea(){
        System.out.println("Method Called Successfully");
    }
}
public class lab9_2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Triangle t=new Triangle();

        r.getArea();
        c.getArea();
        t.getArea();
    }
}
