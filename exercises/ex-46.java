import java.util.Scanner;


class math46 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {


      System.out.print("Enter Number 1: ");
      int numA = Integer.parseInt(in.next());
      System.out.print("\033[1F\33[K");

      System.out.print("Enter Number 2: ");
      int numB = Integer.parseInt(in.next());
      System.out.print("\033[1F\33[K");

      int lower;
      int higher;
      if (numA < numB) {
        lower = numA;
        higher = numB;
      } else {
        lower = numB;
        higher = numA;
      }
      int total = 0;
      int ii = 1;
      for(int i = lower; i <= higher; i++) {
        total++;
      }
      System.out.println("\u001B[32m"+"Sum of Numbers ["+lower+","+higher+"]: "+total+"\u001B[0m");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
