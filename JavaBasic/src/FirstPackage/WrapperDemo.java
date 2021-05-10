package FirstPackage;


public class WrapperDemo {
    public static void main(String[] args) {
//        primitive data type to object covert process
        int x = 8;
        Integer n = Integer.valueOf(x);
        System.out.println(n);
        
        Integer m = x;// it is called autoboxing
        System.out.println(m);
        
//        covert from object to primitive data type
        Double d = Double.valueOf(10.26);
        double e = d.doubleValue();
        System.out.println(e);
        
        double c = d;//unboxing
        System.out.println(c);
    }
}
