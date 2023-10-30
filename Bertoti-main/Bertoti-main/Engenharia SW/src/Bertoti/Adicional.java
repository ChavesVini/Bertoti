package Bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adicional {
    public String adicionarAdicional() {
        List<String> Adicionais = new ArrayList<String>();
        String adicional;
        Scanner leitor = new Scanner(System.in);
        Adicionais.add("Granulado");
        Adicionais.add("Leite Condensado");

        System.out.println("Temos esses adicionais: \n ");

        for (int i=0; i<Adicionais.size(); i++) {
            System.out.println(Adicionais.get(i));
        }

        System.out.println("\nQual você vai querer? ");
        adicional = leitor.nextLine();

        if (Adicionais.contains(adicional)) {
            return adicional;
        } else {
            System.err.println("Ops! Não foi possivel localizar um dos itens, tente de novo! \n");
            return null;
        }
    }
    public String getAdicional() {
        return this.adicional;
    }
} 