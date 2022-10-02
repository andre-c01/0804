import java.util.Scanner;

class math36 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {

      System.out.print("Enter Number of Games: ");
      int num = Integer.parseInt(in.next());
      float discout = 0;
      if ( num<10 ) {
        discout=0f;
      } else if ( (num >= 10) && (num <=19) ) {
        discout=0.20f;
      } else if ( (num >= 20) && (num <=49) ) {
        discout=0.30f;
      } else if ( (num >= 50) && (num <=99) ) {
        discout=0.40f;
      } else if (num >= 100) {
        discout=0.50f;
      }

      float ogcost = (num*50);
      float discountv = (ogcost*discout);
      float discountedvalue = (ogcost-discountv);

      System.out.println("\n"+"############################");
      System.out.println("Original Cost      : " + ogcost + "€");
      System.out.println("Discount Value     : " + discountv + "€");
      System.out.println("Cost with Discount : " + discountedvalue + "€");
      System.out.println("############################");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
