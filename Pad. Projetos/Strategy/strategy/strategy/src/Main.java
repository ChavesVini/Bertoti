public class Main {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();

        calcular.setCalculo(new CalcularCirculo());
        System.out.println("Área do círculo: " + calcular.fazerCalculo(5));

        calcular.setCalculo(new CalcularQuadrado());
        System.out.println("Área do quadrado: " + calcular.fazerCalculo(4));
    }
}