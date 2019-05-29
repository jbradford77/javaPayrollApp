import java.util.*;
public class Arrays1 {
  public static void main(String[] args) {
    Random r = new Random();
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = r.nextInt(100);
    }
    System.out.println("Element 7 is: " + nums[7]);
    String[] names = new String[3];
    names[0] = "Joe";
    names[1] = "Jane";
    names[2] = "Herkimer";
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    //this line should throw an exception
    System.out.println(names[6]);
  }
}