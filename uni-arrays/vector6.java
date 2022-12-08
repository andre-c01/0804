package com.mycompany.ex6;
import java.util.Arrays;
import java.util.Scanner;

/**
6. Faça um programa que receba o nome de cinco produtos e os seus respetivos preços, armazene os em dois vetores separados,
* um para os produtos e o outro para os preços. O programa deve calcular e mostrar:
    A quantidade de produtos com preço inferior a 50.00 euros;
    O nome dos produtos com preço entre os 50.00 e 100.00 euros;
    A média dos preços dos produtos com preço superior a 100.00 euros.
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] produto = new String[5];
        String[] prodentre = new String[5];

        float precos[] = new float[10];
        int ninferior;
        int nprodutosmaior;
        float produtosmaior;
        
        for (var i = 0; i < produto.length; i++) {
            System.out.println("Introduza o nome do produto: ");
            produto[i] = scanner.nextLine();
            System.out.println("Introduza o proco do produto: ");
            precos[i] = scanner.nextFloat();
            
            if (precos[i] < 50) {
                ninferior++;
            }
            if ( (precos[i] > 50) && (precos[i] < 100) ) {
                prodentre[i] = produto[i];
            }
            if (precos[i] > 100) {
                nprodutosmaior++;
                produtosmaior+=precos[i];
            }
        }
        System.out.println("Numero de produtos com preço inferior a 50.00 euros (" + ninferior + ")");
        System.out.println("nome dos produtos com preço entre os 50.00 e 100.00 euros \n" + Arrays.toString(prodentre));
        System.out.println("Média dos preços dos produtos com preço superior a 100.00 euros (" + ninferior + ")");
        
    }
}
