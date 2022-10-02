import java.util.ArrayList;
import java.util.Scanner;


class math47 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();

    int keeploop = 1;
    double total = 0;
    int li = 0;
    int num = 0;
    double listsize = 0;
    double avg = 0;
    int pos = 0;
    int neg = 0;
    double negper = 0;
    double posper = 0;

    System.out.print("\n");
    do {


      System.out.println("########################");
      System.out.println("Size of List           : "+list.size());
      System.out.println("Average of Values      : "+avg);
      System.out.println("Num of Positive Values : "+pos);
      System.out.println("Per of Positive Values : "+posper);

      System.out.println("Num of Negetive Values : "+neg);
      System.out.println("Per of Negetive Values : "+negper);
      System.out.println("########################"+"\n");
      System.out.println("(c to exit)");


      System.out.print("Enter Number: ");
      String input = (in.next());
      boolean integerOrNot1 = input.matches("-?\\d+");
      if (integerOrNot1 == true) {
        num = Integer.parseInt(input);
        list.add(num);
        listsize = (list.size());

        total += num;
        if (num < 0) {
          neg +=1;
        } else if (num > 0) {
          pos +=1;
        }

        avg = (total/listsize);
        negper = (neg/listsize*100);
        posper = (pos/listsize*100);

        for (int i = 0; i < 11; i++) {
          System.out.print("\033[1F\33[K");
        }



        //System.out.print("Is int");
      } else {
        for (int i = 0; i < 11; i++) {
          System.out.print("\033[1F\33[K");
        }
        if (input.contains("c")) {
          keeploop = 0;
          System.out.print("\033[1F\33[K");
          System.out.println("Exit");
        }
      }


    } while (keeploop == 1);

  }

}
