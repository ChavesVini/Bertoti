package Bertoti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sabor {
    public static void main(String[] args) {
        List<String> Sabores = new ArrayList<String>();
        List<String> saborEspecifico = new ArrayList<String>();
        String saborEscolhido;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Temos esses sabores: " + "\n");

        Sabores = new ArrayList<String>();
        Sabores.add("Chocolate");
        Sabores.add("Uva");
        Sabores.add("Morango");
        
        for (int i = 0; i < Sabores.size(); i++) {
            System.out.println(Sabores.get(i));
        }

        System.out.println("\n" + "Qual você escolhe?");
        saborEscolhido = leitor.nextLine();
        
        if (Sabores.contains(saborEscolhido)) {
            saborEspecifico.add(saborEscolhido);
            System.out.println(saborEspecifico);

        } else {
            System.err.println("Sabor errado! Tente de novo!");
        }
    }
}