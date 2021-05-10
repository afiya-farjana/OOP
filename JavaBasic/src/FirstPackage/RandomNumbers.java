
package FirstPackage;

import java.util.Random;


public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(20)+5;//5 to 19
        System.out.println(num);
//        Another way
        int n = (int)(Math.random()*10)+1;
        System.out.println(n);
    }
}
