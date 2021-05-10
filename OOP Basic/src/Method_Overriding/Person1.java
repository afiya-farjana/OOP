package Method_Overriding;


public class Person1 {
    String name;
    int age;
    int testsuper = 10;
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    void display2(){
        System.out.println("Inside parent class Person1");
    }
}
