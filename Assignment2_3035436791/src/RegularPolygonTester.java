import java.awt.Color;

/**
 * This is a tester class for the class Regular Polygon where we initialize the variables of
 * the class as well as call the methods to check their implementation.
 * 
 * @author siddharth
 *
 */

public class RegularPolygonTester {
	
	/**
	 * Here, an object of the class is created, the instance variables are initialized and debugging messages are printed if the 
	 * commands executes. 
	 * 
	 * @param args unused.
	 * @author siddharth
	 *
	 */

	public static void main(String[] args) {
		RegularPolygon rp = new RegularPolygon(3, 10);
		System.out.println("Object1 created");
		System.out.println("Number of sides: " + rp.getNumOfSides());
		System.out.println("Radius: " + rp.getRadius());
		
		RegularPolygon rp1 = new RegularPolygon(8);
		System.out.println("Object2 created");
		System.out.println("Number of sides: " + rp1.getNumOfSides());
		System.out.println("Radius: " + rp1.getRadius());
		
		RegularPolygon rp2 = new RegularPolygon();
		System.out.println("Object3 created");
		System.out.println("Number of sides: " + rp2.getNumOfSides());
		System.out.println("Radius: " + rp2.getRadius());
		

		rp.setColor (new Color(0,250,0)); 
		System.out.println("Color added which is " + rp.getColor());
		
		rp.setFilled(true);
		System.out.println("Polygon Filled = " + rp.getFilled());
		
		
		rp.setTheta(30);
		System.out.println("Orientation provided=" + rp.getTheta());
		
		rp.setXc(0); 
		System.out.println("X-coordinate of centre of polygon added = " + rp.getXc());
		
		rp.setYc(0); 
		System.out.println("Y-coordinate of centre of polygon added) = " + rp.getYc());
	

		rp.translate(250, 100);
		System.out.println("Translate method working");
		System.out.println("xc after translating="+rp.getXc());
		System.out.println("yc after translating="+rp.getYc());
		
		rp.rotate(10);
		System.out.println("Rotate method working");
		System.out.println("Theta is now = "+rp.getTheta());
		
		
		
		
		for(int i = 0; i < rp.getXLocal().length; i++)
		{
			System.out.println("Initial co-ordinates of vertice "+ i + " is "+ rp.getXLocal()[i] + "," + rp.getYLocal()[i]);
		}
		
		System.out.println("The point 5,0 lies inside the shape is " + rp.contains(5, 0));

	}

}
