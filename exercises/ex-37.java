import java.util.Scanner;

class math37 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Tempeture: ");
      int num = Integer.parseInt(in.next());
      String msg = "x";
      if ( num<=15 ) {
        msg="Muito Frio";
      } else if ( (num >= 16) && (num < 23) ) {
        msg="Frio";
      } else if ( (num >= 23) && (num < 26) ) {
        msg="Agradavel";
      } else if ( (num >= 26) && (num <= 30) ) {
        msg="Quente";
      } else if ( num >= 31 ) {
        msg="Muito Quente";
      }

      System.out.println(msg);

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
