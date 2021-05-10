package FirstPackage;
import java.util.*;

public class StringBuffer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(input.nextLine()) ;
        sb.append(" Anny ");
        sb.append(37);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.delete(3, 7);
        System.out.println(sb);
        sb.setLength(6);
        System.out.println(sb);
        String s;
        s = input.nextLine();
        StringBuffer ss = new StringBuffer(s);
        //convert stringBuffer to string to store the data
        String s1 = ss.reverse().toString();
        if(s.equals(s1))
            System.out.println("Palindrome");
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
