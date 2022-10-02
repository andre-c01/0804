import java.util.Scanner;
import java.util.Random;

class math18 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    try {
        System.out.print("Enter Number between 0 - 10: ");
        int num = Integer.parseInt(in.next());

        switch (num) {
          case 0:
            System.out.println("zero");
            break;
          case 1:
            System.out.println("um");
            break;
          case 2:
            System.out.println("dois");
            break;
          case 3:
            System.out.println("tres");
            break;
          case 4:
            System.out.println("quatro");
            break;
          case 5:
            System.out.println("cinco");
            break;
          case 6:
            System.out.println("seis");
            break;
          case 7:
            System.out.println("sete");
            break;
          case 8:
            System.out.println("oito");
            break;
          case 9:
            System.out.println("nove");
            break;
          case 10:
            System.out.println("dez");
            break;
          default :
            System.out.println();
            System.out.println("Tem de ser entre 0 e 10");
            break;
        }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
