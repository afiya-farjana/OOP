package FirstPackage;

import java.util.Scanner;


public class ConvetionOfDataTypes {
    public static void main(String[] args) {
//        Convert decimal to binary,hexadecimal,octal number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String binary,octal,hexadecimal;
        binary = Integer.toBinaryString(n);
        System.out.println("Binary of "+n+" is "+binary);
        octal = Integer.toOctalString(n);
        System.out.println("Octal of "+n+" is "+octal);
        hexadecimal = Integer.toHexString(n);
        System.out.println("Hexadecimal of "+n+" is "+hexadecimal);
        
//        convert binary,hexadecimal,octal number to decimal
        binary = "1111";
        Integer dec = Integer.parseInt(binary, 2);
        
        //String hex = Integer.toHexString(binary);
        
        System.out.println("Binary to decimal is "+dec);
        dec = Integer.parseInt(octal, 8);
        System.out.println("Octal to decimal is "+dec);
    }
}
