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
    public void prueba1(){
        int ma=1, d=1, t=1, c=1, mo=1, r;
        r=100;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
}