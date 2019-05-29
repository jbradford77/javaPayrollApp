import util.KeyboardReader;
import java.util.*;
 
public class Game {
    private int answer = 67;
    private static String [] correctMessages =
            { "Correct", "Right on!", "Most Excellent!" };
    private static String [] lowMessages =
            { "Too low", "Try higher next time" };
    private static String [] highMessages =
            { "Too high", "Try lower next time" };
     
    public Game() {
        Random r = new Random();
        answer = r.nextInt(100) + 1;
        System.out.println(answer);
    }
     
    public void play() {
        int guess;
        Random r = new Random();
        do {
            guess = KeyboardReader.getPromptedInt("Enter a number 1 -100: ");
            if (guess < answer)
                System.out.println(lowMessages[r.nextInt(lowMessages.length)]);
            else if (guess > answer)
                System.out.println(highMessages[r.nextInt(highMessages.length)]);
        } while (guess != answer);
        System.out.println(correctMessages[r.nextInt(correctMessages.length)]);
    }
     
    public static void main(String[] args) {
        char playAgain = 'Y';
        do {
            new Game().play();
            playAgain = KeyboardReader.getPromptedChar("Play again (y/n)?: ");
        } while (playAgain == 'Y' || playAgain == 'y');            
    }
}