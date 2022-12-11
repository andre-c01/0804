import java.util.Arrays;
import java.util.Scanner;

class array02 {

  public static void main(String[] args) {

    float[][] nums = new float[4][4];

    nums[0][0] = (float) 3;
    nums[0][1] = (float) 4.5;
    nums[0][2] = (float) 6;

    nums[1][0] = (float) 2.1;
    nums[1][1] = (float) 3;
    nums[1][2] = (float) 7;

    nums[2][0] = (float) 5;
    nums[2][1] = (float) 6.2;
    nums[2][2] = (float) 4;

    float sum = 0;

    for(int i = 0; i < nums[0].length; i++) {
      sum += nums[0][i];
    }
    System.out.println("["+ nums[0][0] +"] ; " + "["+ nums[0][1] +"] ; " + "["+ nums[0][2] +"] -> " + sum);
    sum=0;

    for(int i = 0; i < nums[1].length; i++) {
      sum += nums[1][i];
    }
    System.out.println("["+ nums[1][0] +"] ; " + "["+ nums[1][1] +"] ; " + "["+ nums[1][2] +"] -> " + sum);
    sum=0;

    for(int i = 0; i < nums[2].length; i++) {
      sum += nums[2][i];
    }
    System.out.println("["+ nums[2][0] +"] ; " + "["+ nums[2][1] +"] ; " + "["+ nums[2][2] +"] -> " + sum);
    sum=0;

    for(int i = 0; i < nums.length; i++) {
      sum += nums[i][0];
    }
    System.out.print(sum + "  ; ");
    sum=0;

    for(int i = 0; i < nums.length; i++) {
      sum += nums[i][1];
    }
    System.out.print(sum + "  ; ");
    sum=0;

    for(int i = 0; i < nums.length; i++) {
      sum += nums[i][2];
    }
    System.out.print(sum + "\n");
    sum=0;
  }
}
