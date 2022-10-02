import java.util.Scanner;


class math45 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {


      System.out.print("Enter Number 1: ");
      int numA = Integer.parseInt(in.next());
      System.out.print("\033[1F\33[K");
      int numB = 0;
      do {
        System.out.print("Enter Number 2: ");
        numB = Integer.parseInt(in.next());
        if (numB < numA) {
          System.out.print("\033[1F\33[K"+"\u001B[31m"+"2º Numer must be higher then first ("+numA+")"+"\u001B[0m");
          Thread.sleep(3000);
          System.out.print("\r\33[K");
        }
        System.out.print("\033[1F\33[K");
      } while (numB < numA);

      int total = 0;
      for(int i = numA; i <= numB; i++) {
        total++;
      }
      System.out.println("\u001B[32m"+"Sum of Numbers: "+total+"\u001B[0m");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    } catch (InterruptedException e) {
            e.printStackTrace();
    }

  }

}
