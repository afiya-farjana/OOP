
package ObjectPassingInstance;

/**
 *
 * @author Afia Farjana
 */
public class ObjectPassingInstance {
    public static void main(String[] args) {
        test n1 = new test();
        test n2 = new test();
        
        n1.length = 20;
        n1.width = 10;
        
        n2.area(n1.length, n1.width);
    }
}
