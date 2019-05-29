class MyBase {
	private int x;
	public MyBase(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void show() {
		System.out.println("x=" + x);
	}
}

class MyDerived extends MyBase {
	private int y;
	public MyDerived(int x) {
		super(x);
	}
	public MyDerived(int x, int y) {
		super(x);
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public void show() {
		super.show();
		System.out.println("y = " + y);
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		MyBase b = new MyBase(2);
		b.show();
		MyDerived d = new MyDerived(3, 4);
		d.show();
	}
}