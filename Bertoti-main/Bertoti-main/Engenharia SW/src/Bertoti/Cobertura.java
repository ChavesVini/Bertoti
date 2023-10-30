package Bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cobertura {
    public String adicionarCobertura() {
        List<String> Coberturas = new ArrayList<String>();
        String cobertura;
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
            return cobertura;
        } else {
            System.err.println("Ops! Não foi possivel localizar um dos itens, tente de novo! \n");
            return null;
        }
    }
    public String getCobertura() {
        return this.cobertura;
    }
}