import java.util.Scanner;

class math19 {

  public static void main(String[] args) {

    float cost;
    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Enter Code: ");
        int code = Integer.parseInt(in.next());
        switch (code) {
          case 100:
            System.out.println("Cachorro Quente");
            float cost = 1.20;
            break;
          case 101:
            System.out.println("Bauru Simples");
            float cost = 1.30;
            break;
          case 102:
            System.out.println("Bauru com Ovo");
            float cost = 1.50;
            break;
          case 103:
            System.out.println("Hamburger");
            float cost = 1.20;
            break;
          case 104:
            System.out.println("Cheeseburguer");
            float cost = 1.30;
            break;
          case 105:
            System.out.println("Refrigerante");
            float cost = 1.00;
            break;
          default :
            System.out.println("Codigo nao encontrado");
            throw new NumberFormatException();
            break;
        }
        System.out.print("Quantidade: ");
        int quant = Integer.parseInt(in.next());
        System.out.print("#########");
        System.out.print("Custo: " + (cost * quant) + "€");

    } catch (NumberFormatException e) {
        System.out.println("Not a valid number");
    }

  }

}
