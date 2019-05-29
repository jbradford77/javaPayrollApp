public class Arrays2 {
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "Joe";
		names[1] = "Jane";
		names[2] = "Herkimer";
		printArray(names);
	}
	public static void printArray(String[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].toUpperCase());
		}
	}
}