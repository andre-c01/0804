import java.util.Scanner;
import java.util.ArrayList;


class math40 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {

      int num = 10;
      System.out.println("(press c to exit)");

      do {

        System.out.print("Enter Number: ("+list.size()+"): ");
        String input = in.next();
        boolean integerOrNot1 = input.matches("-?\\d+");
        if (integerOrNot1 == true) {
          num = Integer.parseInt(input);
          list.add(num);
        } else {
          if (input.contains("c")) {
            throw new Exception();
          }
        }
        System.out.print("\033[1F\33[K");
      } while (num != 0);

      int range1 = 0;
      int range2 = 0;
      int range3 = 0;
      int range4 = 0;
      int outofrange = 0;
      int li = 0;

      for(int i = 0; i < list.size(); i++) {

        li = (list.get(i));

        if ( ( li >= 0  ) && ( li <= 25  ) ) {
          range1++;
        } else if ( ( li >= 26  ) && ( li <= 50  ) ) {
          range2++;
        } else if ( ( li >= 51  ) && ( li <= 75  ) ) {
          range3++;
        } else if ( ( li >= 76  ) && ( li <= 100  ) ) {
          range4++;
        } else if ( li > 100 ) {
          outofrange++;
        }

      }

      System.out.println("#########################");
      System.out.println("Range          [0,25] : "+range1);
      System.out.println("Range         [26,50] : "+range2);
      System.out.println("Range         [51,75] : "+range3);
      System.out.println("Range        [76,100] : "+range4);
      System.out.println("Out of Range      [*] : "+outofrange);
      System.out.println("#########################"+"\n");


    } catch (Exception e) {
      System.out.println("Exit");
    }

  }

}
