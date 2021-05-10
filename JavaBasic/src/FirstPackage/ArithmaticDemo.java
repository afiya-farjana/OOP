package FirstPackage;
import java.util.Scanner;

public class ArithmaticDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1,number2,add=0,sub=0,mul=0,div=0,remainder;
        char c;
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter operation: ");
        c = input.next().charAt(0);
        System.out.print("Enter second number: ");
        number2 = input.nextDouble();
        
        if(c=='+'){
        add = number1 + number2;
            System.out.println("Addition is: "+add);
        }
        else if(c=='-'){
        sub = number1 + number2;
            System.out.println("Substraction is: "+sub);
        }
        else if(c=='*'){
        mul = number1 * number2;
            System.out.println("Multiplication is: "+mul);
        }
        else if(c=='/'){
            if(number2>0){
               div = number1 / number2;
            System.out.println("Division is: "+div);
            }
            else{
                System.out.println("Divison not possible");
            }
        }
        else if(c=='%'){
            remainder = number1%number2;
            System.out.println("Remainder is: "+remainder);
        }
        
    }
}
