
package Abstraction;


public class Rectangle extends Shape{
    Rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    @Override
    void area(){
        System.out.println("Area of rectangle "+dim1*dim2);
    }
}
