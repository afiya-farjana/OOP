package BoxProblem;


public class Box {
    double height,width,depth,volume;
    static int count=0;
    Box(double height, double width, double depth){
        this.height = height;//here this refers to height in box class
        this.width = width;
        this.depth = depth;
        count++;
    }
    
    void displayVol(){
        System.out.println("The volume of box "+count+" is: "+height*width*depth);
    }
}
