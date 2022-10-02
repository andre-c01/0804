import java.util.Scanner;

class math13 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter a Number: ");
        int num = Integer.parseInt(in.next());
        int result = ( num % 2 );
        System.out.println(result);
        if ( num == 1 ) {
          System.out.println("Imper");
        } else {
          System.out.println("Par");
        }
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
