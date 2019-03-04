import java.awt.Color;

/**
 * This is a tester class for the class Circle where we initialize the variables of
 * the class as well as verify the implementation of the functions.
 * 
 * @author siddharth
 *
 */
public class CircleTester {

	/**
	 * Here, the instance variables are initialized and subsequent message are printed if the 
	 * commands executes. 
	 * 
	 * @param args A collection of strings separated by space used in declaration.
	 * @author siddharth
	 *
	 */
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Object created");
		
		circle.color = new Color(0, 250, 0);
		System.out.println("Color added");
		
		circle.filled = true;
		System.out.println("circle Filled");
		
		circle.theta = -Math.PI/2;
		System.out.println("Orientation provided=" + circle.theta);
		
		circle.xc = 0;
		System.out.println("X-coordinate of centre of shape added which is " + circle.xc);
		
		circle.yc = 0;
		System.out.println("Y-coordinate of centre of shape added) which is " + circle.yc);
		
		circle.setVertices(50);
		System.out.println("Local coordinates of circle set");
		
		for(int i=0;i<circle.xLocal.length;i++) {
			System.out.println("xLocal["+i+"]= "+circle.xLocal[i]);
			System.out.println("yLocal["+i+"]= "+circle.yLocal[i]);
		}
		
		circle.translate(400, 100);
		System.out.println("Translate method working");
		System.out.println("xc after translating="+circle.xc);
		System.out.println("yc after translating="+circle.yc);

		
		circle.rotate(Math.PI);
		System.out.println("Rotate method working");
		System.out.println("Theta is now = "+circle.theta);
		
		int[] x;
		int [] y;
		x = circle.getX();
		System.out.println("getX() functionc implemented");
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
		
		System.out.println("getY() Function implemented");
		y= circle.getY();
		for(int i = 0; i < y.length; i++){
			System.out.println(y[i]);
		}


	}

}
