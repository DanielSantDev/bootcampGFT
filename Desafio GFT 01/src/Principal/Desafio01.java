package Principal;

import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        double area;

        area = 3.14159 * (Math.pow(num.nextDouble(),2));

        System.out.printf("A=%.4f\n", area);
    }

}
