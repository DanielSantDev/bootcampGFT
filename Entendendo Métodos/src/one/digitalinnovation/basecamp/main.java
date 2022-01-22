package one.digitalinnovation.basecamp;

public class main {

    public static void main(String[] args) {
        // Calculadora
        System.out.println("\nExercício Calculadora.");
        Calculadora.soma(5,10);
        Calculadora.multiplicacao(5,15);
        Calculadora.divisao(20,10);
        Calculadora.subtracao(8,6);

        // Quadrilatero
        System.out.println("\nExercício quadrilátero.");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        // Retornos
        System.out.println("\nExercício retornos");
        double areaQuadrado = QuadrilateroRetornos.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);
        double areaRetangulo = QuadrilateroRetornos.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);
        double areaTrapezio = QuadrilateroRetornos.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }

}
