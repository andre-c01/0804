import java.util.Arrays;
import java.util.Scanner;

class array02 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[] nums = new int[6];

    nums[0] = 1;
    nums[1] = 0;
    nums[2] = 5;
    nums[3] = -2;
    nums[4] = -5;
    nums[5] = 7;

    int sum = (nums[0]+nums[1]+nums[5]);
    System.out.println("Sum = " + sum);

    for(int i = 0; i < nums.length; i++) {
      System.out.println("("+i+"): " + nums[i]);
    }
  }
}
