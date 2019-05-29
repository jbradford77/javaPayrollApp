public class Loops1 {
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println("While loop");
		while (i <= 512) {
			System.out.println("i is " + i);
			i *= 2;
		}
		System.out.println("i is now " + i);
		
		System.out.println("Do while loop");
		do {
			i = i - 300;
			System.out.println("i is now " + i);
		}
		while (i > 0);
		
		System.out.println("for loop");
		for (i = 0; i < 12; i++)
			System.out.print(" " + i);
		System.out.println();
		
		System.out.println("for loop that declares a counter");
		for (int j = 0; j < 12; j++)
			System.out.print(" " + j);
		System.out.println();
		
		System.out.println("ForEach loop");
		String[] names = { "Jane", "John", "Bill" };
		for (String oneName : names)
			System.out.println(oneName.toUpperCase());
	}
}