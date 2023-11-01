package Bertoti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sabor {
    private String sabor;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return sabor;
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

        System.out.println("Temos esses sabores: \n");

        for (int i=0; i<Sabores.size(); i++) {
            System.out.println(Sabores.get(i));
        }

        System.out.println("\nQual você vai querer? ");
        sabor = leitor.nextLine();
            
        if (Sabores.contains(sabor)) {
            setSabor(sabor);
        } else {
            System.err.println("Ops! Não foi possivel localizar um dos itens, tente de novo!");
            deletarSabor();
            adicionarSabor();
        }
    }
}
