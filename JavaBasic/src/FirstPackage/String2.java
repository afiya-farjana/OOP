package FirstPackage;
import java.util.*;

public class String2 {
    public static void main(String[] args) {
        String s1 = "   Bangledesh is my country!  ";
        String s2 = "I have no life";
        String[] s4 = s2.split(" ");
        for(String x: s4){
            System.out.println(x);
        }
        System.out.println(s1+" "+s1.length());
        String s3;
        s3 = s1.trim();
        System.out.println(s3+" "+s3.length());
        s3 = s1.replace('!', '?');
        System.out.println(s3+" "+s3.length());
        
        char ch = s1.charAt(0);
        System.out.println("Char at 0 index is: "+ch);
//        returns ascii value
        int ascii = s2.codePointAt(0);
        System.out.println("Ascii value of 0 index: "+ascii);
        
        int a = s2.indexOf("no");
        System.out.println(a);
//        search this character after 5 index
        System.out.println(s2.indexOf("e", 6));
//        There are 4 types of indexOf
//        public int indexOf(String str)
//        public int indexOf(String str, int fromIndex)
//        public int indexOf(int char)
//        public int indexOf(int char, int fromIndex)

    }
}
