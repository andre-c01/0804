import java.util.Scanner;

class math08 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    try {
        int i = Integer.parseInt(in.next());
        int result = ( i + 1 );
        System.out.println("Successor: " + result );
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
