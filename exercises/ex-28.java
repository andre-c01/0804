import java.util.ArrayList;
import java.util.Scanner;

class math28 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {

      for(int i = 0; i < 15; i++) {
        System.out.print("Enter Hight: ");
        int num = Integer.parseInt(in.next());
        list.add(num);
      }

      int min = list.get(0);
      int max = list.get(0);
      for(int i = 0; i < list.size(); i++) {
        if ( list.get(i) < min ) {
          min = list.get(i);
        }
        if ( list.get(i) > max ) {
          max = list.get(i);
        }
      }
      System.out.println("The Max is: " + max);
      System.out.println("The Min is: " + min);
      //System.out.println(list);

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
