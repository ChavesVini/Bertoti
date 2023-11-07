package Bertoti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sabor {
    private String sabor;
    private double valor;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return sabor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void deletarSabor() {
        sabor = null;
    }    

    public void adicionarSabor() {
        Scanner leitor = new Scanner(System.in);
        List<String> Sabores = new ArrayList<String>();
        Sabores.add("Chocolate");
        Sabores.add("Uva");
        Sabores.add("Morango");

        System.out.println("\nTemos esses sabores:\n");

        for (int i=0; i<Sabores.size(); i++) {
            System.out.println(Sabores.get(i));
        }

        Random rnm = new Random(23);
        valor = rnm.nextDouble(3.5)*100;
        setValor(valor);

        System.out.println("\nQual você vai querer?\n");
        sabor = leitor.nextLine();
            
        if (Sabores.contains(sabor)) {
            setSabor(sabor);
        } else {
            System.err.println("\nOps! Não foi possivel localizar um dos itens, tente de novo!\n");
            deletarSabor();
            adicionarSabor();
        }
    }
}