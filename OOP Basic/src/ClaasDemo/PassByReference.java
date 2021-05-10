package ClaasDemo;


public class PassByReference {
    String name;
    void change(PassByReference r2){
        r2.name = "Anny";
    }
    
    public static void main(String[] args) {
        PassByReference n = new PassByReference();
        n.name = "Farjana";
        System.out.println("Before calling: "+n.name);
        
        n.change(n);
        System.out.println("After calling: "+n.name);
    }
}
