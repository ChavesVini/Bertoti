package Bertoti;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Teste {
    @Test
    public void test() {
        Cobertura cbt = new Cobertura();
        assertEquals(cbt.getCobertura(), null);
        Sabor sbt = new Sabor();
        assertEquals(sbt.getSabor(), null);
        Confirmacao cfm = new Confirmacao();
        assertEquals(cfm.getEntrega(), null);
        assertEquals(cfm.getPagamento(), null);
        Adicional adc = new Adicional();
        assertEquals(adc.getAdicional(), null);
        cbt.setCobertura("Chocolate");
        sbt.setSabor("Morango");
        cfm.setEntrega("Não");
        cfm.setPagamento("Pix");
        adc.setAdicional("Granulado");
        assertEquals(cbt.getCobertura(), "Chocolate");
        assertEquals(sbt.getSabor(), "Morango");
        assertEquals(cfm.getEntrega(), "Não");
        assertEquals(cfm.getPagamento(), "Pix");
        assertEquals(adc.getAdicional(), "Granulado");

        //valor sabor: 3,50
        //valor adicional: 2,00
        //valor cobertura: 2,50
    }
}