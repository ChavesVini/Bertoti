public class eew {
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
