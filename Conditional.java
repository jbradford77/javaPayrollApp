public class Conditional {
	public static void main(String[] args) {
		int i = -6;
		String s;
		s = "i is " + ((i >= 0) ? "positive" : "negative");
		System.out.println(s);
	}
}