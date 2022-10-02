import java.util.Scanner;

class math33 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
      System.out.print("Enter Length : ");
      int vl = Integer.parseInt(in.next());
      System.out.print("Enter Width: ");
      int vw = Integer.parseInt(in.next());
      System.out.print("Enter Height: ");
      int vh = Integer.parseInt(in.next());
      float volume = (vh*vw*vl);
      System.out.println("Volume : "+volume);

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
