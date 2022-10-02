import java.util.Scanner;

class math10 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    try {
        float i = Integer.parseInt(in.next());
        float result = ( i / 2 );
        System.out.println("Half: " + result );
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
