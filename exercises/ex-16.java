import java.util.Scanner;

class math16 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter Salary: ");
        float num = Float.parseFloat(in.next());
        if ( num <= 525 ) {
          double sal = ( num + (num*0.15) );
          System.out.println("15%");
          System.out.println("Salary: " + sal + "€" );
        } else {
          double sal = ( num + (num*0.10) );
          System.out.println("10%");
          System.out.println("Salary: " + sal + "€" );
        }
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
