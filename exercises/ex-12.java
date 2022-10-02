import java.util.Scanner;

class math12 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter a Number: ");
        float i = Integer.parseInt(in.next());
        float result = ( i % 2 );
        System.out.println("Resto: " + result );
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
