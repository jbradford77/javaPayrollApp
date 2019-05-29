import util.KeyboardReader;

public class Switch1 {
	public static void main(String[] args) {
		char c = 'X';
		c = KeyboardReader.getPromptedChar("Enter a letter a - d ");
		switch (c) {
		case 'a':
		case 'A' : System.out.println("A is for Ardvark");
			break;
		
		case 'b':
		case 'B': System.out.println("B is for Baboon");
			break;
		
		case 'c':
		case 'C': System.out.println("C is for Cat");
			break;
		
		case 'd':
		case 'D': System.out.println("D is for Dog");
			break;
		
		default : System.out.println("Invalid choice");
		}
	}
}