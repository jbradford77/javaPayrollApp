// puts two copies of a small array into a larger one
public class CopyArray {
  public static void main(String[] args) {
    int nums[] = { 6, 2, 4, 9, 1 };
    int biggerNums[] = new int[10];
    System.arraycopy(nums, 0, biggerNums, 0, nums.length);
    System.arraycopy(nums, 0, biggerNums,
                     nums.length, nums.length);
    for (int i = 0; i < biggerNums.length; i++)
      System.out.println(biggerNums[i]);
  }
}