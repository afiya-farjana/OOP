package FirstPackage;
import java.util.*;

public class String1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "Afiya Farjana Anny";
        String a = new String ("Afiya Farjana Anny");
        String d;
        String n = new String ("I have no life!");
        char[] c = {'a','n','n','y'}; 
        System.out.println(c);
        String[] name = {"My ","name ","is ","anny"};
        for(String i: name)
            System.out.print(i+" ");
        System.out.println('\n'+s+" "+s.length()+'\n'+n+" "+n.length());
////      here == operator is comparing references of 2 strings
////      that's why it will show not equal  
//        if(a == s) 
//            System.out.println("Strings are equal");
//        else
//            System.out.println("Not equal");
        if(a.equals(s))
            System.out.println("Equals");
        else System.out.println("not Equals");
        if(a.contains(n))
            System.out.println("yes,,Equals");
        else System.out.println("No,not Equals");
        
//        taking input
         d = input.nextLine();
//        to ignore upper or lowercase in if else
       
        if(a.equalsIgnoreCase(d))
            System.out.println("hell! Equals");
        else System.out.println("HEll! not Equals");
        
//        Uppercase,lowerCase
        System.out.println("LowerCase: "+ d.toLowerCase());
        System.out.println("UpperCase: "+d.toUpperCase());
        System.out.println("it\'s my life\\\\");
        
//        check fist letter returns true or false
        if(a.startsWith("A"))
            System.out.println("True");
        else System.out.println("False");
        boolean m = s.endsWith("a");
        System.out.println(m);
    }
}
