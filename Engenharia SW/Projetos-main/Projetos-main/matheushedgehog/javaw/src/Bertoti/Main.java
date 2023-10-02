package Bertoti;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        List<String> Sabores = new ArrayList<String>();
        List<String> Coberturas = new ArrayList<String>();
        List<String> Adicionais = new ArrayList<String>();
        List<String> Pagamento = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        String sabor;
        String adicional;
        String cobertura;
        String confirma;
        String pagamento;
        String entrega;
        Sabores.add("Chocolate");
        Sabores.add("Uva");
        Sabores.add("Morango");
        Coberturas.add("Chocolate");
        Coberturas.add("Morango");
        Adicionais.add("Granulado");
        Adicionais.add("Leite Condensado");
        Pagamento.add("Cartão");
        Pagamento.add("Pix");

        while (contador != 1) {
            System.out.println("\nTemos esses sabores: \n");

            for (int i=0; i<Sabores.size(); i++) {
                System.out.println(Sabores.get(i));
            }
            
            System.out.println("\nQual você vai querer? ");
            sabor = leitor.nextLine();
            System.out.println("Temos essas coberturas: \n");

            for (int i=0; i<Coberturas.size(); i++) {
                System.out.println(Coberturas.get(i));
            }

            System.out.println("\n Qual você vai querer? ");
            cobertura = leitor.nextLine();            
            System.out.println("Temos esses adicionais: \n ");

            for (int i=0; i<Adicionais.size(); i++) {
                System.out.println(Adicionais.get(i));
            }

            System.out.println("\n Qual você vai querer? ");
            adicional = leitor.nextLine(); 

            Sorvete sor1 = new Sorvete(sabor, cobertura, adicional);

            System.out.println("\nO seu pedido ficou: \n");
            System.out.println(sor1.getSabor() + "\n" + sor1.getCobertura() + "\n" + sor1.getAdicional());
            System.out.println("\nÉ isso mesmo? (y/n)");
            confirma = leitor.nextLine();               

            if (confirma.charAt(0) == 'n') {
                continue;
            } else 
            if (confirma.charAt(0) == 'y') {
                contador += 1;
            }

            if (Adicionais.contains(adicional) && Coberturas.contains(cobertura) && Sabores.contains(sabor)) {
                continue;
            } else {
                contador = 0;
                System.err.println("Ops! Não foi localizado um dos itens, tente de novo! \n");
            }
        }

        System.out.println("\nTemos essas formas de pagamento: ");

        for (int i=0; i<Pagamento.size(); i++) {
            System.out.println(Pagamento.get(i));
        }

        System.out.println("\n Qual você vai querer? ");
        pagamento = leitor.nextLine();            
        System.out.println("Quer que entregue?: (y/n)\n ");
        entrega = leitor.nextLine();  


    }
}