import util.KeyboardReader;

public class Switch2 {
	public static void main (String[] args) {
		char c = 'X';
		c = KeyboardReader.getPromptedChar("Enter a letter a - d ");
		switch (c) {
		default: System.out.println("Invalid choice - assuming 'A'");
		case 'a':
		case 'A': System.out.println("A is for Apple");
			break;
		case 'b':
		case 'B': System.out.println("B is for Boy");
			break;
		case 'c':
		case 'C': System.out.println("C is for Car");
			break;
		case 'd':
		case 'D': System.out.println("D is for Dog");
			break;
		}
	}
}