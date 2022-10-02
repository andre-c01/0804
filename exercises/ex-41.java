import java.util.Scanner;
import java.util.ArrayList;


class math41 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {

      int num = 10;
      do {

        System.out.print("Enter Age: ("+list.size()+"): ");
        num = Integer.parseInt(in.next());
        if (num == 0) {
          System.out.println("\033[1F\33[K"+"\u001B[31m"+"STOP"+"\u001B[0m");
        } else {
          list.add(num);
          System.out.print("\033[1F\33[K");
        }

      } while (num != 0);

      int adults = 0;
      int minors = 0;
      int li = 0;
      int totaladultages = 0;

      for(int i = 0; i < list.size(); i++) {

        li = (list.get(i));

        if ( li >= 18 ) {
          adults++;
          totaladultages += li;
        } else {
          minors++;
        }

      }
      int adultavg = (totaladultages/adults);

      System.out.println("#########################");
      System.out.println("Nº of minors      : "+minors);
      System.out.println("Nº of adults      : "+adults);
      System.out.println("Avg age of adults : "+adultavg);
      System.out.println("#########################"+"\n");


    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
