import java.util.Random;

class math26 {

  public static void main(String[] args) {

    Random rand = new Random();

    int low = 1000;
    int high = 1999;

    for(int i = low; i < high; i++) {

      int r = (i % 11);
      if ( r == 5 ) {
        System.out.println(i);
      }

    }

  }

}
