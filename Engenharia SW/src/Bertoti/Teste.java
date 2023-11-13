package Bertoti;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {
    Adicional adc = new Adicional();
    Cobertura cbt = new Cobertura();
    Confirmacao cfm = new Confirmacao();
    Sabor sbr = new Sabor();

    @Test
    public void digitarErrado() {
        //Caso digitar algo errado, vai apagar e retornar nulo
        assertNull(cbt.getCobertura());
        assertNull(sbr.getSabor());
        assertNull(adc.getAdicional());

        //Caso digitar "n", vai apagar e retornar nulo
        cbt.deletarCobertura();
        sbr.deletarSabor();
        adc.deletarAdicional();
        assertNull(cbt.getCobertura());
        assertNull(sbr.getSabor());
        assertNull(adc.getAdicional());

        //Caso colocar sim, mas errar ao digitar a entrega ou a forma de pagamento, vai apagar e retornar nulo
        cbt.setCobertura("Chocolate");
        sbr.setSabor("Morango");
        adc.setAdicional("Granulado");
        assertEquals(cbt.getCobertura(), "Chocolate");
        assertEquals(sbr.getSabor(), "Morango");
        assertEquals(adc.getAdicional(), "Granulado");
        assertNotNull(cbt.getCobertura());
        assertNotNull(sbr.getSabor());
        assertNotNull(adc.getAdicional());
        cfm.deletarEntrega();
        cfm.deletarPagamento();
        assertNull(cfm.getEntrega());
        assertNull(cfm.getPagamento());

        //Digitar certo e colocar "sim"
        cbt.setCobertura("Chocolate");
        sbr.setSabor("Morango");
        cfm.setEntrega("Não");
        cfm.setPagamento("Pix");
        adc.setAdicional("Granulado");
        assertEquals(cbt.getCobertura(), "Chocolate");
        assertEquals(sbr.getSabor(), "Morango");
        assertEquals(adc.getAdicional(), "Granulado");
        assertEquals(cfm.getPagamento(), "Pix");
        assertEquals(cfm.getEntrega(), "Não");
        assertNotNull(cbt.getCobertura());
        assertNotNull(sbr.getSabor());
        assertNotNull(adc.getAdicional());
        assertNotNull(cfm.getEntrega());
        assertNotNull(cfm.getPagamento());
    }
}