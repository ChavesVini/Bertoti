public class CalcularCirculo implements Calculador {
    @Override
    public double calcular(double raio) {
        return Math.PI * raio * raio; 
    }
}