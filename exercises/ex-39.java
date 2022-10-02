import java.util.Scanner;

class math39 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Number Higher then 1: ");
      int num = Integer.parseInt(in.next());
      int total = 0;
      if (num > 1) {
        for (int i = 1; i <= num; i++) {
          total += i;
        }
      }
      System.out.println(total);


    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
