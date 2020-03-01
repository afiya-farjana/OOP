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
public class ObjectPass {
    public static void main(String[] args) {
        Test x = new Test(10,20);
        x.area(x);
    }
}
