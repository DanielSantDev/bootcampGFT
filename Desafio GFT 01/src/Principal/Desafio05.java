package Principal;

import java.io.IOException;
import java.util.Scanner;

public class Desafio05 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        double n = leitor.nextDouble();

        System.out.println(String.format((String.valueOf(n).startsWith("-") ? "" : "+") + "%.4E", n));

    }
}
