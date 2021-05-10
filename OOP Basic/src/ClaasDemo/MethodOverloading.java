package ClaasDemo;


public class MethodOverloading {
//    this is called polymorphism
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("Nothing to add");
    }
    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        ob.add(15,20.5);//automatic type conversion
        ob.add(10,10);
        ob.add();
        ob.add(2,4,8);
        ob.add(5.5,10.8);
    }
}
