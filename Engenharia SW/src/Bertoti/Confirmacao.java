package Bertoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Confirmacao {
    private String pagamento;
    private String entrega;
    
    Cobertura cbt = new Cobertura();
    Adicional adc = new Adicional();
    Sabor sbr = new Sabor();

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getEntrega() {
        return entrega;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void deletarEntrega() {
        entrega = null;
    }

    public void deletarPagamento() {
        pagamento = null;
    }

    public void adicionarPagamento() {
        List<String> Pagamentos = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        Pagamentos.add("Pix");
        Pagamentos.add("Dinheiro");

        Double valor = cbt.getValor() + adc.getValor() + sbr.getValor();
        System.out.println("Ficou: R$ %.2f" + valor);
        System.out.println("Temos essas formas de pagamento:\n");

        for (int i=0; i<Pagamentos.size(); i++) {
            System.out.println(Pagamentos.get(i));
        }

        System.out.println("\nQual você vai querer?\n");
        pagamento = leitor.nextLine();        

        if (Pagamentos.contains(pagamento)) {
            setPagamento(pagamento);
        } else {
            System.err.println("\nOps! Não temos essa forma de pagamento, tente de novo!\n");
            deletarPagamento();
            adicionarPagamento();
        }
    }

    public void adicionarEntrega() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nQuer que entregue?: (y/n)\n ");
        entrega = leitor.nextLine();  

        if (entrega.charAt(0) == 'y') {
            setEntrega("Sim");
        } else {
            if (entrega.charAt(0) == 'n') {
                setEntrega("Não");
            } else {
                System.err.println("\nVocê digitou uma letra errada! Tente de novo!\n");
                deletarEntrega();
                adicionarEntrega();
            }
        }
    }
}