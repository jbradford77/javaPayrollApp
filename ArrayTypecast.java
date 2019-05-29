public class ArrayTypecast {
	public static void main(String[] args) {
		
		int i = 5;
		double d;
		
		d = i;
		i = (int) d;
		
		int inums[] = { 1, 2, 3, 4, 5 };
		double[] dnums;
		
		// line below fails
		//dnums = inums;
		
		dnums = new double[] {1.1, 2.2, 3.3, 4.4, };
		
		// line below fails
		//inums = (int[]) dnums;
		
	}
}