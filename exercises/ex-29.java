class math29 {

  public static void main(String[] args) {

    int low = 100;
    int high = 200;

    for(int i = low; i < high; i++) {

      int r = (i % 2);
      if ( r == 1 ) {
        System.out.println(i);
      }

    }

  }

}
