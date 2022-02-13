package Principal;

import java.util.Scanner;

public class Desafio07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c=0, r=0, s=0, x;
        char tipo;
        int testes = input.nextInt(); //testes

        for (int i=0; i < testes; i++){
            x = input.nextInt();
            tipo = input.next().charAt(0);
            if( tipo == 'C' ){
                    c += x;
            }else
                if (tipo == 'R' ){
                    r += x;
            }else
                if(tipo == 'S'){
                    s += x;
                }
        }
        int soma = c + r + s;
        System.out.println("Total: " + soma + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.printf("Percentual de coelhos: %.2f", ((double)c*100) / soma);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", ((double)r*100) / soma);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", ((double)s*100) / soma);
        System.out.print(" %");
    }

}
