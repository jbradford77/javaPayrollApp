public class Break {
	public static void main(String[] args) {
		for ( ; ; ) { // create an infinite loop
			// no initialization, no test, no increment
			double x = Math.random();
			if (x < 0.1) break;
			System.out.print((int) (x * 10) + " ");
		}
		System.out.println("Done!");
	}
}