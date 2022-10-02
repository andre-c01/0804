import java.util.Scanner;

class math32 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
      System.out.print("Enter Num for Var 'A': ");
      int A = Integer.parseInt(in.next());
      System.out.print("Enter Num for Var 'B': ");
      int B = Integer.parseInt(in.next());

      System.out.println("\n"+"#########################");
      System.out.println("Original Vars : A:" + A + " ; B:" + B);
      System.out.println("#########################");

      int tempA = A;
      A = B;
      B = tempA;

      System.out.println("\n"+"#########################");
      System.out.println("Swaped Vars   : A:" + A + " ; B:" + B);
      System.out.println("#########################");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
