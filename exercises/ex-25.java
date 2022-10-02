import java.util.ArrayList;
import java.util.Scanner;

class math25 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {

      int num = 1;
      while ( num != 0 ) {

        System.out.print("Enter Number Between 0 and 100: ");
        num = Integer.parseInt(in.next());
        if ( ( num < 100 ) && ( num > 0 ) ) {
          list.add(num);
        } else if ( num != 0 ){
          throw new NumberFormatException();
        }

      }

      int total = 0;
      float avg = 0;
      int min = list.get(0);
      int max = list.get(0);
      for(int i = 0; i < list.size(); i++) {
        total += list.get(i);
        avg = total / list.size();
        if ( list.get(i) < min ) {
          min = list.get(i);
        }
        if ( list.get(i) > max ) {
          max = list.get(i);
        }
      }
      System.out.println("The Average is: " + avg);
      System.out.println("The Max is: " + max);
      System.out.println("The Min is: " + min);
      //System.out.println(list);

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
