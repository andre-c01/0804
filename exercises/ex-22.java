import java.util.Scanner;

class math22 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

        int num = 0;
        do {
          System.out.print("Enter PassKey: ");
          num = Integer.parseInt(in.next());
        }
        while (num != 12345);
        System.out.println("Correct!");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
