import java.util.Scanner;

class math35 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Number of Books: ");
      int num = Integer.parseInt(in.next());
      int points = 0;
      if (num==0) {
        points=0;
      } else if (num==1) {
        points=5;
      } else if (num==2) {
        points=15;
      } else if (num==3) {
        points=30;
      } else if (num >= 4) {
        points=60;
      }
      System.out.println("Points Award: " + points);



    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
