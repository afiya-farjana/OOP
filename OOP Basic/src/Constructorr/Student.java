package Constructorr;

public class Student {

    String name, address;
    int roll, phone;
//    Constructor-> special type mathod
//    it doesn't have any return type
//    it's name should be exactly as class name
// parameterized constructor
    Student(String na, String ad, int ro, int ph) {
        name = na;
        address = ad;
        roll = ro;
        phone = ph;
    }
    
//    default constructor
    Student()
    {
        System.out.println("Kisu nai");
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Phone no: "+phone);
        System.out.println("Address: "+address+"\n");
    }
}
