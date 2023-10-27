package Bertoti;

public class Main {
    public static void main(String[] args) {
        Sabor sbt = new Sabor();
        sbt.adicionarSabor();
        Adicional adc = new Adicional();
        adc.adicionarAdicional();
        Cobertura cbt = new Cobertura();
        cbt.adicionarCobertura();
        Sorvete svt = new Sorvete(sbt.getSabor(), cbt.getCobertura(), adc.getAdicional());
        System.out.println(svt);

    }
}