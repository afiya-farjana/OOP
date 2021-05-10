package Constructorr;


public class StudentOVL {
    String name,dept,phn;
    long  id;
    
    StudentOVL()
    {
        System.out.println("No Information"+"\n");
    }
    
    StudentOVL(String n, String d)
    {
        name = n;
        dept = d;
    }
        
    StudentOVL(String n, String d,long i,String p)
    {
        name = n;
        dept = d;
        id = i;
        phn = p;
    }
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Department: "+dept);
        System.out.println("Phone no: "+phn+"\n");
    }
}
