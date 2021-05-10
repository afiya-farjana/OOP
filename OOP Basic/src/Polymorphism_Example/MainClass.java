package Polymorphism_Example;

import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base,height,width;
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        System.out.print("Enter width: ");
        width = input.nextDouble();
        Shape[] s = new Shape[3];
        
        s[0] = new Shape();
        s[1] = new Triangle(base,height);
        s[2] = new Rectangle(height,width);
        
        for(int i=0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
