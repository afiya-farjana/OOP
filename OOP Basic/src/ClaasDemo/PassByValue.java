package ClaasDemo;


public class PassByValue {
    void change (int i){
        i = 20;
    }
    public static void main(String[] args) {
        PassByValue a = new PassByValue();
        int x = 10;
        System.out.println("x before call: "+x);
        
        a.change(x);
        System.out.println("x after call: "+x);
//        Here x will pass to change method and value of
//        i will change to 10 but it won't affect the actual
//        value of x because primitive data types store in stack memory
    }
}
