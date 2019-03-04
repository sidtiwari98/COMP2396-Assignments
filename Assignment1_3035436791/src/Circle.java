/**
 * This is a subclass of the Shape class which is used to model cirlces.
 * It inherits all instance variables and functions of the Shape class.
 * 
 * @author siddharth
 *
 */
public class Circle extends Shape{
	
	/**
	 * This method is used for setting the local coordinates of the upper left  
	 * and lower right vertices. 
	 * It is an overridden method of the Shape class.
	 * 
	 * @param d Defined as the radius of the class
	 *
	 */

	public void setVertices(double d) {
		xLocal = new double [2];
		yLocal = new double [2];
		yLocal[0]=xLocal[0] = 0 - d;
		yLocal[1]=xLocal[1] = d;
		
	}
	
	/**
	 * A method for retrieving the x-coordinates of the Upper left and Lower right vertices of 
	 * an axis-aligned bounding box of the Circle in the screen coordinate system.
	 * It is an overridden method of the Shape class.
	 * 
	 * @return The coordinate values rounded to the nearest integers.
	 *
	 */
	@SuppressWarnings("null")
	public int[] getX() {
		int[] x_ = new int[4];
		for(int i = 0 ; i < xLocal.length ; i++)
		{
			x_[i] = (int) (xLocal[i] + xc);
			x_[i] = Math.round(x_[i]);
		}
		return x_;
	}
	
	/**
	 * A method for retrieving the y-coordinates of the Upper left and Lower right vertices of 
	 * an axis-aligned bounding box of the Circle in the screen coordinate system.
	 * It is an overridden method of the Shape class.
	 * 
	 * @return The coordinate values rounded to the nearest integers.
	 *
	 */
	@SuppressWarnings("null")
	public int[] getY() {
		int[] y_ = new int[4];
		for(int i = 0 ; i < yLocal.length ; i++)
		{
			y_[i] = (int) (yLocal[i] + yc);
			y_[i] = Math.round(y_[i]);
		}
		return y_;
		
	}
}
