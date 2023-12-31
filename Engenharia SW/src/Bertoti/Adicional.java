package Bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Adicional {
    private String adicional;
    private Double valor;

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getAdicional() {
        return this.adicional;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
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

        System.out.println("\nQual você vai querer? (Irá custar R$ 2,50)\n");
        adicional = leitor.nextLine();

        if (Adicionais.contains(adicional)) {
            setAdicional(adicional);
            setValor(2.5);
        } else {
            System.err.println("\nOps! Não foi possivel localizar um dos itens, tente de novo!\n");
            deletarAdicional();
            adicionarAdicional();
        }
    }
} 