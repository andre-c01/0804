import java.util.Arrays;
import java.util.Scanner;

class array04 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[] nums = new int[10];
    int pos = 0;
    int neg = 0;
    int possum = 0;

    for(int i = 0; i < nums.length; i++) {
      System.out.print("Enter Number ("+ (i+1) +"): ");
      nums[i] = in.nextInt();
      if(nums[i] > 0) {
        pos++;
        possum += nums[i];
      } else {
        neg++;
      }
      System.out.print("\033[1F\33[K");
    }

    System.out.println("Number of Positive nums: " + pos);
    System.out.println("Number of Negative nums: " + neg);
    System.out.println("Sum of Positive nums: " + possum);
  }
}
