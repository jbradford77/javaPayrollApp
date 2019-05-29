public class BreakNot {
	public static void main(String[] args) {
		double x = 0.0;
		for ( x = Math.random(); x >= 0.1; x = Math.random() ) {
			System.out.print((int) (x * 10) + " ");
		}
		System.out.println("done!");
	}
}