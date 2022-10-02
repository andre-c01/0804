import java.util.Scanner;

class math20 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter Lower: ");
        int lower = Integer.parseInt(in.next());
        System.out.print("Enter Higher: ");
        int higher = Integer.parseInt(in.next());

        for (int i = lower; i <= higher; i++) {
            System.out.println(i);
        }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
