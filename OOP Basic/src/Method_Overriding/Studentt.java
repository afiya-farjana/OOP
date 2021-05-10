package Method_Overriding;


public class Studentt extends Person1 {
    String dept;
    int testsuper = 20;
    @Override
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is " +age);
        System.out.println("Department is " +dept);
    }
    void display1(){
        System.out.println(super.testsuper);
    }
    @Override
    void display2(){
        super.display2();
        System.out.println("Inside child class studentt");
    }
}
