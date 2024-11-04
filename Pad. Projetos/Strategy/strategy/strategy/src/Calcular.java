public class Calcular {
    private Calculador calculador;

    public void setCalculo(Calculador calculador) {
        this.calculador = calculador;
    }

    public double fazerCalculo(double valor) {
        if (calculador == null) {
            throw new IllegalStateException("Não definido.");
        }
        return calculador.calcular(valor);
    }
}