import java.util.Scanner;
import java.util.Stack;

class stack01 {

  public static void main(String[] args) {

    Stack<String> stk = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    int menu;
    String entry;

    do {

      System.out.print("""
                        ------ Menu -------
                          1 - Write to Stack
                          2 - Read Top el.
                          3 - Exit
                          Type an option:""");
      menu = scanner.nextInt();
      if(menu == 1) {
        //scanner.nextLine();
        System.out.print("Write entry: ");
        entry = scanner.next();
        stk.push(entry);
      } else if(menu == 2) {
        System.out.println(stk.peek());
        System.out.println("Stack: " + stk);
      }
    } while(menu != 3);

  }
}
