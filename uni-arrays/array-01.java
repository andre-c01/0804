import java.util.Arrays;
import java.util.Scanner;

class array01 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[] nums = new int[10];
    boolean foundn = false;

    for(int i = 0; i < nums.length; i++) {
      System.out.print("Enter Number (" + (i+1) + "): ");
      nums[i] = in.nextInt();
      System.out.print("\033[1F\33[K");
    }

    System.out.print("Enter Search number: ");
    int searchn = in.nextInt();

    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == searchn) {
        foundn = true;
      }
    }

    if(foundn == true) {
      System.out.println("Number Found (" + searchn + ")");
    } else {
      System.out.println("Number Not Found (" + searchn + ")");
    }
  }
}
