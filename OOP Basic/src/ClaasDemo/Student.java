package ClaasDemo;

import java.util.Scanner;


public class Student {
    String name,address;
    int roll,phone;

    
//    method is kind of function
//    you have to give return type first like function
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter Roll: ");
        roll = input.nextInt();
        System.out.print("Enter Phone no: ");
        phone = input.nextInt();
        System.out.println("Enter address: ");
        address = input.next();
    }
    void setInfo(String n,String a, int r, int p)
    {
        name = n;
        address = a;
        roll = r;
        phone = p;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Phone no: "+phone);
        System.out.println("Address: "+address);
    }
}
