
package Fibonacci_recursion;

import java.util.Scanner;

/**
 *
 * @author Afia Farjana
 */
public class Fibonacci {
    public static int fibo(int n){
        if(n<2)
            return n;
        
        else
            return fibo(n-1) + fibo(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}
