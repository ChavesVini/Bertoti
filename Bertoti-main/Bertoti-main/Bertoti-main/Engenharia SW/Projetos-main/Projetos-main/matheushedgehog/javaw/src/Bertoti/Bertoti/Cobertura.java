package Bertoti;

import java.util.*;

public class Cobertura {
    private String inputCobertura;

    public static void main(String[] args) {
        System.out.println("Temos esses sabores: " + "\n");

        List<String> Coberturas = new ArrayList<String>();
        Coberturas.add("Chocolate");
        Coberturas.add("Morango");

        for (int i = 0; i < Coberturas.size(); i++) {
            System.out.println(Coberturas.get(i));
        }
        
        Scanner inputCobertura = new Scanner(System.in);
        System.out.print("\n" + "Qual sabor você escolhe? ");
        inputCobertura.nextLine();
        }
    }





