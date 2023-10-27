package Bertoti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sabor {
    public String adicionarSabor() {
        List<String> Sabores = new ArrayList<String>();
        String sabor;
        Scanner leitor = new Scanner(System.in);
        Sabores.add("Chocolate");
        Sabores.add("Uva");
        Sabores.add("Morango");

        System.out.println("Temos esses sabores: \n");

        for (int i=0; i<Sabores.size(); i++) {
            System.out.println(Sabores.get(i));
        }

        System.out.println("\nQual você vai querer? ");
        sabor = leitor.nextLine();
        
        while (sabor != Sabores) {
            if (Sabores.contains(sabor)) {
                setSabor(sabor);
                return sabor;
            } else {
                System.err.println("Ops! Não foi possivel localizar um dos itens, tente de novo! \n");
                return null;
            }
        }
    public String getSabor() {
        return this.sabor;
    }
    public String setSabor(String saborMod) {
        return this.sabor = saborMod;
        }
    }
}