import util.KeyboardReader;

public class Christmas {
	public static void main(String[] args) {
		int day = KeyboardReader.getPromptedInt("What day of Christmas? ");
		System.out.println(
				"on the " + day + " day of Christmas, my true love gave to me ");
		switch (day) {
		
		case 12: System.out.println("Twelve drummers drumming ");
		case 11: System.out.println("Eleven pipers piping ");
		case 10: System.out.println("Ten lords leaping ");
		case 9: System.out.println("Nine ladies dancing ");
		case 8: System.out.println("Eight maids a milking ");
		case 7: System.out.println("seven swans a swimming ");
		case 6: System.out.println("Six geese a laying ");
		case 5: System.out.println("five golden RINGS");
		case 4: System.out.println("four calling birds ");
		case 3: System.out.println("Three french hens");
		case 2: System.out.println("two turtle doves, and a ");
		case 1: System.out.println("PARTRIDGE IN A PEAR TREE");
		
		}
	}
}