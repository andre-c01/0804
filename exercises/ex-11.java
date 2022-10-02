import java.util.Scanner;

class math11 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter a grade 1: ");
        float grade1 = Integer.parseInt(in.next());
        System.out.print("Enter a grade 2: ");
        float grade2 = Integer.parseInt(in.next());
        float result = ( (grade1+grade2) / 2 );
        System.out.println("Average: " + result );
        if ( result >= 10 ) {
          System.out.println("Aprovado");
        } else {
          System.out.println("Reprovado");
        }
    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
