class Purple {
	protected int i = 0;
	public Purple() {
		System.out.println("Purple() running and i = " + this.i);
	}
	public Purple(int i) {
		this.i = i;
		System.out.println("Purple(i) running and i = " + this.i);
	}
}

class Violet extends Purple {
	Violet() {
		System.out.println("Violet() running and i = " + this.i);
	}
	Violet(int i) {
		System.out.println("Violet(i) running and i = " + this.i);
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		System.out.println("new Violet():");
		new Violet();
		
		System.out.println();
		System.out.println("new Violet(4):");
		new Violet(4);
	}
}