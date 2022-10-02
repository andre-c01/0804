import java.util.Scanner;

class math17 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter Plan: ");
        String plan = in.next();
        System.out.print("Enter Salary: ");
        float sal = Float.parseFloat(in.next());

        switch (plan.toUpperCase()) {
          case "A":
            System.out.println("10%");
            System.out.println("Salario " + ( sal + (sal*0.10) ) + "€" );
            break;
          case "B":
            System.out.println("15%");
            System.out.println("Salario " + ( sal + (sal*0.15) ) + "€" );
            break;
          case "C":
            System.out.println("20%");
            System.out.println("Salario " + ( sal + (sal*0.20) ) + "€" );
            break;
        }

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
