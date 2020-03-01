/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassingConstructor;

/**
 *
 * @author Afia Farjana
 */
public class Test {
    int length;
    int width;
    
    Test(int l, int w){
        length = l;
        width = w;
    }
    
    void area(Test x){
        int AreaOfRectangle = x.length * x.width;
        System.out.println("Area Of Rectangle: "+AreaOfRectangle);
    }
}
