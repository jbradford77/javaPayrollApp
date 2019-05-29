public class Rectangle {
	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int getArea() {
		return height * width;
	}
	
	public boolean equals(Object other) {
		if (other instanceof Rectangle) {
			Rectangle otherRect = (Rectangle) other;
			return this.height == otherRect.height &&
					this.width == otherRect.width;
		}
		else return false;
	}
}