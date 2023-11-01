package Bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cobertura {
    private String cobertura;

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getCobertura() {
        return this.cobertura;
    }

    public void deletarCobertura() {
        cobertura = null;
    }    

    public void adicionarCobertura() {
        List<String> Coberturas = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        Coberturas.add("Chocolate");
        Coberturas.add("Morango");

        System.out.println("Temos essas coberturas: \n");

        for (int i=0; i<Coberturas.size(); i++) {
            System.out.println(Coberturas.get(i));
        }

        System.out.println("\nQual você vai querer? ");
        cobertura = leitor.nextLine();   
        
        if (Coberturas.contains(cobertura)) {
            setCobertura(cobertura);
        } else {
            System.err.println("Ops! Não foi possivel localizar um dos itens, tente de novo! \n");
            deletarCobertura();
            adicionarCobertura();
        }
    }

}