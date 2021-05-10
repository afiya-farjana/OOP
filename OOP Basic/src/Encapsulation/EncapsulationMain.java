package Encapsulation;


public class EncapsulationMain {
    public static void main(String[] args) {
        Person p= new Person();
        p.setName ("Anny");
        p.setAge(20);
        System.out.println("Name is "+p.getName());
        System.out.println("Age is "+p.getAge());
    }
}
