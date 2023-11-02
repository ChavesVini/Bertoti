package Bertoti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean pedidoConcluido = false;

        while (pedidoConcluido == false) {
            Sabor sbr = new Sabor();
            sbr.adicionarSabor();
            Adicional adc = new Adicional();
            adc.adicionarAdicional();
            Cobertura cbt = new Cobertura();
            cbt.adicionarCobertura();

            System.out.println("Seu pedido ficou: \n\nSabor: " + sbr.getSabor() + "\nAdicional: " + adc.getAdicional() + "\nCobertura: " + cbt.getCobertura() + "\n\nÉ isso mesmo? (y/n)");
            String confirma = leitor.nextLine();
            Confirmacao cfm = new Confirmacao();

            if (confirma.charAt(0) == 'n') {
                sbr.deletarSabor();
                adc.deletarAdicional();
                cbt.deletarCobertura();
                continue;
            } else if (confirma.charAt(0) == 'y') {
                cfm.adicionarPagamento();
                cfm.adicionarEntrega();
            } else {
                System.out.println("Você inseriu uma letra errada!");
            }

            System.out.println("Seu pedido final ficou: \n\nSabor: " + sbr.getSabor() + "\nAdicional: " + adc.getAdicional() + "\nCobertura: " + cbt.getCobertura() + "\nEntregar? " + cfm.getEntrega() + "\nPagamento: " + cfm.getPagamento() + "\n\nÉ isso mesmo? (y/n)");
            String confirmar = leitor.nextLine();

            if (confirmar.charAt(0) == 'n') {
                sbr.deletarSabor();
                adc.deletarAdicional();
                cbt.deletarCobertura();
                cfm.deletarPagamento();
                cfm.deletarEntrega();
                continue;
            } else if (confirmar.charAt(0) == 'y') {
                System.out.println("Obrigado!");
                pedidoConcluido = true;
            } else {
                System.out.println("Você inseriu uma letra errada!");
            }
        }
    }
}