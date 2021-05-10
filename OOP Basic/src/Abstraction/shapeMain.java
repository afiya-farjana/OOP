
package Abstraction;


public class shapeMain {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(4);
        s.area();
        s = new Rectangle(10,20.5);
        s.area();
        s = new Triangle(4,8);
        s.area();
    }
}
