package Constructorr;


public class OverloadingConstructor {
    public static void main(String[] args) {
        StudentOVL s = new StudentOVL();
        s.display();
        
        StudentOVL s1 = new StudentOVL("Anny","Software Engineering");
        s1.display();
        StudentOVL s2 = new StudentOVL("Dadu","Agriculture", 37, "01736503291");
        s2.display();
    }
}
