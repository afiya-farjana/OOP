package ClaasDemo;

import java.util.Scanner;


public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Student s1 = new Student();
        //s1.input();
        //s1.address = "Balubari Panir tankir mor";
        //s1.display();
        Student s2 = new Student();
        s2.setInfo("Dadu","setabgonj",1,5845);
        s2.display();
        ReturnValueFromMethod sq = new ReturnValueFromMethod();
        int r = sq.square(8);
        System.out.println(r);
    }
}
