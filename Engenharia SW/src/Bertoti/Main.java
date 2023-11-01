package Bertoti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String confirma = leitor.nextLine();
        String confirmar = leitor.nextLine();
        Boolean rollback = false;

        while (rollback == false) {
            Sabor sbr = new Sabor();
            sbr.adicionarSabor();
            Adicional adc = new Adicional();
            adc.adicionarAdicional();
            Cobertura cbt = new Cobertura();
            cbt.adicionarCobertura();

            System.out.println("Seu pedido ficou " + sbr.getSabor() + ", " + adc.getAdicional() + ", " + cbt.getCobertura() + "\n\nÉ isso mesmo? (y/n)");
            Confirmacao cfm = new Confirmacao();

            while (confirma.charAt(0) != 'y') {
                if (confirma.charAt(0) == 'n') {
                    sbr.deletarSabor();
                    adc.deletarAdicional();
                    cbt.deletarCobertura();
                    break;
                } else {
                    cfm.adicionarPagamento();
                    cfm.adicionarEntrega();

                    if (confirma.charAt(0) == 'y') {
                        System.out.println("Seu pedido final ficou: \n\n" + sbr.getSabor() + "\n" + adc.getAdicional() + "\n" + cbt.getCobertura() + "\n" + cfm.getEntrega() + "\n" + cfm.getPagamento() + "É isso mesmo? (y/n)");

                        while (confirmar.charAt(0) != 'y') {
                            if (confirmar.charAt(0) == 'n') {
                                sbr.deletarSabor();
                                adc.deletarAdicional();
                                cbt.deletarCobertura();
                                cfm.deletarPagamento();
                                cfm.deletarEntrega();
                                break;
                            } else {
                                if (confirmar.charAt(0) == 'y') {
                                    System.out.println("Obrigado!");
                                    rollback = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}