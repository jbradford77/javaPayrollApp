import util.*;

public class Continuer {
	public static void main(String[] args) {
		int count = 0;
		do {
			int num = KeyboardReader.getPromptedInt("Enter an integer ");
			if (num < 0) continue;
			count++;
			System.out.println("Number " + count + " is " + num);
		} while (count < 10);
		System.out.println("thank you!");
	}
	
	/*
	  // a better way
	 
	  public static void main(String[] args) {
	    int count = 0;
	    do {
	      int num = KeyboardReader.getPromptedInt("Enter an integer: ");
	      if (num >= 0) {
	        count++;
	        System.out.println("Number " + count + " is " + num);
	      }
	    } while (count < 10);
	    System.out.println("Thank you");
	  }
	*/
	
}