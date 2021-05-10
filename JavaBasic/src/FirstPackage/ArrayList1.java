package FirstPackage;

//import java.util.ArrayList;
import java.util.*;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<Integer>();
        System.out.println("size of ArrayList is: "+name.size());
        
        //adding elements
        name.add(10);
        name.add(20);
        name.add(30);
        name.add(0,40);
        System.out.println(name);
        System.out.println("size of ArrayList is: "+name.size());
//      using for each loop or enhanced for loop
//        used in array or collection
        name.add(3,22);
        name.add(16);
//      set is used to change value of a index
        name.set(4, 44);
        for(int x: name){
            System.out.print(x+" ");
        }
        System.out.println("\nsize is: "+name.size());
        
//        iterator way to print arrayList like vector
//        i think arrayList is java's vector
        name.remove(2);
        Iterator itr = name.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nsize is: "+name.size());
//        name.removeAll(name);
//        it will remove all elements in array
        boolean check = name.isEmpty();
        System.out.println(check);
        boolean contain = name.contains(22);
        System.out.println(contain);
        int pos = name.indexOf(22);
        System.out.println(pos+1);
        int x = name.get(3);
        System.out.println("value of index 3 is: "+x);

    }
}
