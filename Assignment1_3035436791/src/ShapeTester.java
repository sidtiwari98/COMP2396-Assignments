import java.awt.Color;

/**
 * This is a tester class for the class Shape where we initialize the variables of
 * the class as well as verify the implementation of the functions.
 * 
 * @author siddharth
 *
 */
public class ShapeTester {

	/**
	 * Here, the instance variables are initialized and subsequent message are printed if the 
	 * commands executes. 
	 * 
	 * @param args A collection of strings separated by space used in declaration.
	 * @author siddharth
	 *
	 */
	public static void main(String[] args) {
		Shape Shape = new Shape(); //creating an object of type Shape
		System.out.println("Object created");
		
		Shape.color = new Color(0, 250, 0);
		System.out.println("Color added");
		
		Shape.filled = true;
		System.out.println("Shape Filled");
		
		Shape.theta = 30;
		System.out.println("Orientation provided=" + Shape.theta);
		
		Shape.xc = 0;
		System.out.println("X-coordinate of centre of shape added which is " + Shape.xc);
		
		Shape.yc = 0;
		System.out.println("Y-coordinate of centre of shape added) which is " + Shape.yc);
		
		Shape.setVertices(50);
		
		
		Shape.translate(250, 100);
		System.out.println("Translate method working");
		System.out.println("xc after translating="+Shape.xc);
		System.out.println("yc after translating="+Shape.yc);

		
		Shape.rotate(10);
		System.out.println("Rotate method working");
		System.out.println("Theta is now = "+Shape.theta);
		
		Shape.xLocal = new double[2];
		Shape.yLocal = new double[2];
		
		int[] x;
		int[] y;
	
		x = Shape.getX();
		System.out.println("getX() functionc implemented");
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
		
		System.out.println("getY() Function implemented");
		y= Shape.getY();
		for(int i = 0; i < y.length; i++){
			System.out.println(y[i]);
		}

	}

}
