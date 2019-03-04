/**
 * This is a subclass of the Shape class which is used to model triangles.
 * It inherits all instance variables and functions of the Shape class.
 * 
 * @author siddharth
 *
 */
public class Triangle extends Shape{
	
	/**
	 * This method sets the local coordinates of the three coordinates of the Triangle.
	 * It is an overridden method of the Shape class.
	 * 
	 * @param d Defined as the distance from the center of the triangle to any of its vertices.
	 *
	 */

	public void setVertices(double d) {
		{
			double x; // variable used to store the radian value of the angle
			xLocal = new double[3];
			yLocal = new double[3];
			x = 60;
			x = Math.toRadians(60);
			xLocal[0] = d;
			xLocal[1]= xLocal[2] = 0 - d*(Math.cos(x));
		
		yLocal[0] = 0;
		yLocal[1]= 0 - d*(Math.sin(x));
		yLocal[2] = d*(Math.sin(x));
	}
	}
}
