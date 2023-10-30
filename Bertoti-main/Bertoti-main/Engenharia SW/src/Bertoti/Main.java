package Bertoti;

public class Main {
    public static void main(String[] args) {
        Sabor sbr = new Sabor();
        sbr.adicionarSabor();
        System.out.println();
        Adicional adc = new Adicional();
        adc.adicionarAdicional();
        System.out.println(adc.getAdicional());
        Cobertura cbt = new Cobertura();
        cbt.adicionarCobertura();
        System.out.println(cbt.getCobertura());
        //Sorvete svt = new Sorvete(sbt.getSabor(), cbt.getCobertura(), adc.getAdicional());
        //System.out.println(svt);
    }
}