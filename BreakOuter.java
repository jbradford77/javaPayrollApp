public class BreakOuter {
	public static void main(String[] args) {
		
		outer: for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 20; c++) {
				double x = Math.random();
				
				//if (x < 0.02) break;
				if (x < 0.02) break outer;
				System.out.print((int) (x * 10) + " ");
			}
			System.out.println();
		}
	System.out.println("done!");
	}
}