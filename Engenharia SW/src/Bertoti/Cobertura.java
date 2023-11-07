package Bertoti;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cobertura {
    private String cobertura;
    private double valor;

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getCobertura() {
        return this.cobertura;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void deletarCobertura() {
        cobertura = null;
    }    

    public void adicionarCobertura() {
        List<String> Coberturas = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        Coberturas.add("Chocolate");
        Coberturas.add("Morango");

        System.out.println("\nTemos essas coberturas:\n");

        for (int i=0; i<Coberturas.size(); i++) {
            System.out.println(Coberturas.get(i));
        }

        Random rnm = new Random(12);
        valor = rnm.nextDouble(2.5)*100;
        setValor(valor);

        System.out.println("\nQual você vai querer?\n");
        cobertura = leitor.nextLine();   
        
        if (Coberturas.contains(cobertura)) {
            setCobertura(cobertura);
        } else {
            System.err.println("\nOps! Não foi possivel localizar um dos itens, tente de novo!\n");
            deletarCobertura();
            adicionarCobertura();
        }
    }

}