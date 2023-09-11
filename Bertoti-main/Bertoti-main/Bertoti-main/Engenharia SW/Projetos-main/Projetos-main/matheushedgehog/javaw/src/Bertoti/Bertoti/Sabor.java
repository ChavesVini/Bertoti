package Bertoti;

import java.io.Console;
import java.util.*;

public class Sabor {
    private String inputSabor;

    public static void main(String[] args) {
        System.out.println("Temos esses sabores: " + "\n");

        List<String> Sabores = new ArrayList<String>();
        Sabores.add("Chocolate");
        Sabores.add("Uva");
        Sabores.add("Morango");
        
        for (int i = 0; i < Sabores.size(); i++) {
            System.out.println(Sabores.get(i));
        }
        
        Console inputSabor = System.console();
        String leitor = inputSabor.readLine("Qual sabor você escolhe? ");
       
        if (inputSabor.equals(Sabores)) {
            List<String> saborEscolhido = new ArrayList<String>();
            saborEscolhido.add(leitor);
            System.out.println(saborEscolhido);
        }
    }
}