package Principal;

import java.io.IOException;
import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();

        double var = (((B - A) / A) * 100);
        //System.out.printf("%.2f", var ,"%");
        System.out.println(String.format("%.2f%%", var));

    }

}
