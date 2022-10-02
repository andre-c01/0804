import java.util.Scanner;
import java.util.ArrayList;


class math34 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> votes = new ArrayList<Integer>();
    try {

      int vote = 10;
      System.out.println("##############");
      System.out.println("Candidate  (1)");
      System.out.println("Candidate  (2)");
      System.out.println("Candidate  (3)");
      System.out.println("Candidate  (4)");
      System.out.println("#############");
      System.out.println("NULL VOTE  (5)");
      System.out.println("BLANK VOTE (6)");
      System.out.println("STOP       (0)");
      System.out.println("##############"+"\n");

      do {


        System.out.print("Cast Your Vote ("+votes.size()+"): ");
        vote = Integer.parseInt(in.next());
        if ( (vote > 6) || (vote < 0)  ) {
          System.out.print("\033[1F\33[K"+"\u001B[31m"+"Vote Invalid"+"\u001B[0m");
          Thread.sleep(1000);
          System.out.print("\r\33[K");
        } else if (vote == 0) {
          System.out.println("\033[1F\33[K"+"\u001B[31m"+"STOP"+"\u001B[0m");
        } else {
          votes.add(vote);
          System.out.print("\033[1F\33[K");
        }

      } while (vote != 0);

      int cand1 = 0;
      int cand2 = 0;
      int cand3 = 0;
      int cand4 = 0;
      int nullv = 0;
      int blankv = 0;

      for(int i = 0; i < votes.size(); i++) {

        vote = votes.get(i);

        if (vote==1) {
          cand1++;
        } else if (vote==2) {
          cand2++;
        } else if (vote==3) {
          cand3++;
        } else if (vote==4) {
          cand4++;
        } else if (vote==5) {
          nullv++;
        } else if (vote==6) {
          blankv++;
        }

      }

      System.out.println("################");
      System.out.println("Candidate  1 ("+cand1+")");
      System.out.println("Candidate  2 ("+cand2+")");
      System.out.println("Candidate  3 ("+cand3+")");
      System.out.println("Candidate  4 ("+cand4+")");
      System.out.println("#############");
      System.out.println("NULL VOTE  5 ("+nullv+")");
      System.out.println("BLANK VOTE 6 ("+blankv+")");
      System.out.println("################"+"\n");


    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    } catch (InterruptedException e) {
            e.printStackTrace();
    }

  }

}
