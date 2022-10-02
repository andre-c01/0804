import java.util.ArrayList;
import java.util.Scanner;

class math27 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {

      for(int i = 0; i < 10; i++) {
        System.out.print("Enter Number: ");
        int num = Integer.parseInt(in.next());
        list.add(num);
      }

      int nin = 0;
      int nout = 0;
      for(int i = 0; i < list.size(); i++) {
        int v = list.get(i);
        if ( ( v < 20  ) && ( v > 10  ) ) {
          nin++;
        } else {
          nout++;
        }
      }
      System.out.println("[10,20]: " + nin);
      System.out.println("![10,20]: " + nout);

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
