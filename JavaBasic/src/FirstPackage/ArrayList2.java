package FirstPackage;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> name = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
//        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size of 1st array: ");
        int n = input.nextInt();
        
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            name.add(x);
        }
        System.out.println("1st array is:");
        System.out.println(name);
        num.addAll(name);
        Collections.sort(num);
        System.out.println("sorted array is: ");
        num.stream().forEach((i) -> {
            System.out.print(i+" ");
        });
        System.out.println();
        
        System.out.println("reversed array is: ");
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
    }
}
