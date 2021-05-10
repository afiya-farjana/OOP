package Polymorphism_Example;


public class Rectangle extends Shape{
    double height,width;
    Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }
    
    @Override
    double area(){
        System.out.print("Area of rectangle is ");
        return height*width;
    }
}
