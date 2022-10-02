import java.util.Scanner;

class math21 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter Number Less Then 100: ");
        int num = Integer.parseInt(in.next());

        if (num < 100) {

          while (num <= 100) {
            System.out.println(num);
            num++;
          }
        } else {
          throw new NumberFormatException();
        }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
