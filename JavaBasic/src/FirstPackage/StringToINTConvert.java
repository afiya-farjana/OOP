package FirstPackage;


public class StringToINTConvert {
    public static void main(String[] args) {
//        primitive to String 
        int n = 1034167;
        String s = Integer.toString(n);
        System.out.println("String is: "+s);
        double d = 26.42;
        String a = Double.toString(d);
        System.out.println(a);
        
//        String to primitve
        int b = Integer.parseInt(s);
        double c = Double.valueOf(a);
        System.out.println(s+" "+a);
    }
}
