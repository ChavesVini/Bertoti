package Bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adicional {
    private String adicional;

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getAdicional() {
        return this.adicional;
    }

    public void deletarAdicional() {
        adicional = null;
    }    

    public void adicionarAdicional() {
        List<String> Adicionais = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        Adicionais.add("Granulado");
        Adicionais.add("Leite Condensado");

        System.out.println("\nTemos esses adicionais:\n ");

        for (int i=0; i<Adicionais.size(); i++) {
            System.out.println(Adicionais.get(i));
        }

        System.out.println("\nQual você vai querer?\n");
        adicional = leitor.nextLine();

        if (Adicionais.contains(adicional)) {
            setAdicional(adicional);
        } else {
            System.err.println("\nOps! Não foi possivel localizar um dos itens, tente de novo!\n");
            deletarAdicional();
            adicionarAdicional();
        }
    }
} 