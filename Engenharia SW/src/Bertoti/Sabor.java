package Bertoti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sabor {
    private String sabor;
    private Integer valor;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return sabor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public Integer getValor() {
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

        System.out.println("\nQual você vai querer? (Irá custar R$ 5)\n");
        sabor = leitor.nextLine();
            
        if (Sabores.contains(sabor)) {
            setSabor(sabor);
            setValor(5);
        } else {
            System.err.println("\nOps! Não foi possivel localizar um dos itens, tente de novo!\n");
            deletarSabor();
            adicionarSabor();
        }
    }
}