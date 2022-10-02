import java.util.Scanner;


class math42 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Age: ");
      int num = Integer.parseInt(in.next());
      if (num > 10) {
        System.out.println("É MAIOR QUE 10!");
      } else {
        System.out.println("NÃO É MAIOR QUE 10!");
      }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
