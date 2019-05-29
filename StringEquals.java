import util.KeyboardReader;

public class StringEquals {
	public static void main(String[] args) {
		String s = "Hello";
		String t = KeyboardReader.getPromptedString("Enter a string ");
		String message = "That is incorrect";
		if (s.equalsIgnoreCase(t)) message = "That is correct";
		System.out.println(message);
	}
}