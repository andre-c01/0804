import java.util.ArrayList;
import java.util.Scanner;

class math30 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> par = new ArrayList<Integer>();
    ArrayList<Integer> imp = new ArrayList<Integer>();
    try {

      for(int i = 0; i < 10; i++) {
        System.out.print("Enter Number: ");
        int num = Integer.parseInt(in.next());
        list.add(num);
      }

      for(int i = 0; i < list.size(); i++) {
        int v = list.get(i);
        if ( (v % 2) == 1 ) {
          imp.add(v);
        } else {
          par.add(v);
        }
      }
      System.out.println("Par: " + par);
      System.out.println("Imper: " + imp);
      //System.out.println(list);
      //System.out.println(par);
      //System.out.println(imp);

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
