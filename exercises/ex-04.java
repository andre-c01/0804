import java.time.Year;

class math04 {

  public static void main(String[] args) {

    int year_born = 2000;
    int current_year = Year.now().getValue();
    int result = ( current_year - year_born );
    System.out.println("Born in: " + year_born );
    System.out.println("Current Year: " + current_year );
    System.out.println("Idade: " + result );

  }

}
