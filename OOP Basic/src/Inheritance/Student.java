package Inheritance;


public class Student extends Person{
    String qualification;
    
    void display1(){
        display();
        System.out.println("Qualification: "+qualification);
    }
}
