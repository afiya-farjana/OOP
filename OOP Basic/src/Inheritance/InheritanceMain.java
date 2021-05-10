package Inheritance;


public class InheritanceMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anny";
        s1.nid = 9083184;
        s1.qualification = "BSc in engineering";
        s1.display1();
        
        Student s2 = new Student();
        s2.name = "Dadu";
        s2.nid = 9082246;
        s2.qualification = "Agriculture";
        s2.display1();
    }
}
