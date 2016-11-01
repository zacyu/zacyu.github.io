/**
 * CS/COE 0401 Lab 5: MyRectangle
 * @author Zac Yu <me@zacyu.com>
 */

// CS 401 Lab 5
// Fill in the indicated code sections to complete this class.  Then test it
// by compiling and executing Lab5.java.

public class MyRectangle
{
	private int startX;
	private int startY;
	private int width;
	private int height;

	public MyRectangle()
	{
		this(0, 0, 0, 0);
	}

	public MyRectangle(int x, int y, int w, int h)
	{
		startX = x;
		startY = y;
		width = w;
		height = h;
	}

	public int area()
	{
		return width * height;
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y)
	{
		return x >= startX && x <= startX + width &&
			y >= startY && y <= startY + height;
	}

	public void setSize(int w, int h)
	{
		width = w;
		height = h;
	}

	public void setPosition(int x, int y)
	{
		startX = x;
		startY = y;
	}

}
