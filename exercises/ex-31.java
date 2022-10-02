import java.util.Scanner;

class math31 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
      System.out.print("Enter Weight of Bag (g): ");
      int bag = Integer.parseInt(in.next());
      System.out.print("Enter Weight of Feed For Eatch Cat (g): ");
      int feed = Integer.parseInt(in.next());

      int r = ( bag - (2*feed*5)  );
      if ( r > 0 ) {
        System.out.println("Theres " + r + "g left" );
      } else {
        System.out.println("Theres is not anought (" + r + "g)");
      }


    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
