import java.util.Scanner;
import java.util.Arrays;


public class vector5 {

    public static void main(String[] args) {


        int npos;
        boolean run = true;
        int menu = 0;
        String nomeapesquisar;
                
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Numero de posicoes!");

        npos = scanner.nextInt();
        
        String[] nomes = new String[npos];
        
        
        do {
             System.out.print("""
                              ------ Menu -------
                                1 - Registar nomes
                                2 - Pesquisar um nome
                                3 - Listar todos os nomes
                                4 - Sair do Programa 
                                Digite uma op\u00e7\u00e3o:""");
             menu = scanner.nextInt();
             
            if (menu == 1 ) {
                scanner.nextLine();
                for (var i = 0; i < nomes.length; i++) {
                    System.out.println("Introduza o nome de " + i);
                    nomes[i] = scanner.nextLine();
                }
            } else if (menu == 2) {
                System.out.print("Pesquisar o nome :");
                nomeapesquisar = scanner.next();
                for (var i = 0; i < nomes.length; i++) {
                    if ( nomes[i].equals(nomeapesquisar) ) {
                        System.out.println("Nome encontrado (" + nomes[i] + ")");
                    } else {
                        System.out.println("Nome nao encontrado");
                    }
                }
            } else if (menu == 3) {
                System.out.println(Arrays.toString(nomes));
            } else if (menu == 4) {
                run=false;
            }
            
             
        } while(run == true);
        
    }
}
