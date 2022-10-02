import java.util.Scanner;

class math23 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Number: ");
      int num = Integer.parseInt(in.next());

      for (int i = 0; i <= 10; i++) {
          System.out.println(num + " * " + i + " = " + (num*i) );
      }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
