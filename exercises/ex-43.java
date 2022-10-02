import java.util.ArrayList;
import java.util.Scanner;


class math43 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {

      for(int i = 0; i < 10; i++) {
        System.out.print("Enter Number: ");
        int num = Integer.parseInt(in.next());
        System.out.print("\033[1F\33[K");
        if (num<40) {
          list.add(num);
        }
      }

      int total = 0;
      for(int li = 0; li < list.size(); li++) {
        total += (list.get(li));
      }
      System.out.println("\u001B[32m"+"Sum of Numbers: "+total+"\u001B[0m");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
