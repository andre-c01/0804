import java.util.Scanner;

class math24 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Number Higher Then 10: ");
      int num = Integer.parseInt(in.next());

      if ( num > 10 ) {

        for (int i = 1; i <= num; i++) {
          if ( (i % 2) != 1 ) {
            System.out.println(i);
          }
        }
      } else {
        throw new NumberFormatException();
      }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
