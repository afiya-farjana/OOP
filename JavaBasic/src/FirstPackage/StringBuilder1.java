package FirstPackage;
import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder a = new StringBuilder("Anny");
        System.out.println("My name is " + a);
        String str;
        str = input.nextLine();
        StringBuilder ab = new StringBuilder(str);
        ab.append("Too Late ");
        ab.append(24);
        System.out.println(ab);
        ab.reverse();
        System.out.println(ab);
        int b=ab.indexOf(str);
        System.out.println(b);
        ab.delete(5, 8);
        System.out.println(ab);
    }
}
