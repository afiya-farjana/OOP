package Method_Overriding;


public class Main {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "Afiya Farjana";
        s1.age = 20;
        s1.dept = "SWE";
        s1.display();
        s1.display1();
        s1.display2();
        
        Person1 s2 = new Person1();
        s2.name = "Anny";
        s2.age = 22;
        s2.display();
        s2.display2();
    }
}
