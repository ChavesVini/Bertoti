package Bertoti;

import java.util.*;

public class Adicional {
    private String inputAdicional;

    public static void main(String[] args) {
        System.out.println("Temos esses sabores: " + "\n");

        List<String> Adicionais = new ArrayList<String>();
        Adicionais.add("Granulado");
        Adicionais.add("Bis");
        Adicionais.add("Gota de Chocolate");

        for (int i = 0; i < Adicionais.size(); i++) {
            System.out.println(Adicionais.get(i));
        }
        
        Scanner inputAdicional = new Scanner(System.in);
        System.out.print("\n" + "Qual sabor você escolhe? ");
        inputAdicional.nextLine();
        }
    }








