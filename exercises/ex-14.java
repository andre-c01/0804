import java.util.Scanner;

class math14 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter a Number: ");
        int num = Integer.parseInt(in.next());
        if ( num > 0 ) {
          System.out.println("Positive");
        } else {
          System.out.println("Negative");
        }
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
