package com.holamundo.taller1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void calcularDolar(){
        int cant=3, subtot=110, moneda=1, res;
        res=330;
        assertEquals(res, Metodos.calcular(cant,subtot,moneda),0);
    }

    @Test
    public void calcularPeso(){
        int cant=2, subtotal=90, moneda=2, res;
        res=576000;
        assertEquals(res, Metodos.calcular(cant,subtotal,moneda),0);
    }
}