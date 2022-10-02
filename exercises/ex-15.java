import java.util.Scanner;

class math15 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter the Age: ");
        int age = Integer.parseInt(in.next());
        if ( ( age >= 5 ) && (age <= 7) ) {
          System.out.println("Infantil A");
        } else if ( ( age >= 8 ) && (age <= 10) ) {
          System.out.println("Infantil B");
        } else if ( ( age >= 11 ) && (age <= 13) ) {
          System.out.println("Juvenil A");
        } else if ( ( age >= 14 ) && (age <= 17) ) {
          System.out.println("Juvenil B");
        } else if ( age >= 18 ) {
          System.out.println("Adulto");
        } else {
          System.out.println("Sem Categoria");
        }
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
