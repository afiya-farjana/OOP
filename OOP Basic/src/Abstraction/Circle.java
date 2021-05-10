
package Abstraction;

import java.text.DecimalFormat;


public class Circle extends Shape{
    DecimalFormat n = new DecimalFormat("0.00");
    Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        System.out.println("Area of circle "+n.format(Math.PI*dim1*dim2));
    }
}
