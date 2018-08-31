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
    @Test
    public void prueba2(){
        int ma=1, d=1, t=2, c=1, mo=1, r;
        r=100;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba3(){
        int ma=1, d=1, t=3, c=1, mo=1, r;
        r=80;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba4(){
        int ma=1, d=1, t=4, c=1, mo=1, r;
        r=70;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba5(){
        int ma=1, d=2, t=1, c=1, mo=1, r;
        r=120;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba6(){
        int ma=1, d=2, t=2, c=1, mo=1, r;
        r=120;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba7(){
        int ma=1, d=2, t=3, c=1, mo=1, r;
        r=100;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba8(){
        int ma=1, d=2, t=4, c=1, mo=1, r;
        r=90;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba9(){
        int ma=2, d=1, t=1, c=1, mo=1, r;
        r=90;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba10(){
        int ma=2, d=1, t=2, c=1, mo=1, r;
        r=90;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba11(){
        int ma=2, d=1, t=3, c=1, mo=1, r;
        r=70;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba12(){
        int ma=2, d=1, t=4, c=1, mo=1, r;
        r=50;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba13(){
        int ma=2, d=2, t=1, c=1, mo=1, r;
        r=110;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba14(){
        int ma=2, d=2, t=2, c=1, mo=1, r;
        r=110;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba15(){
        int ma=2, d=2, t=3, c=1, mo=1, r;
        r=90;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba16(){
        int ma=2, d=2, t=4, c=1, mo=1, r;
        r=80;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba17(){
        int ma=1, d=1, t=1, c=1, mo=2, r;
        r=320000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba18(){
        int ma=1, d=1, t=2, c=1, mo=2, r;
        r=320000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba19(){
        int ma=1, d=1, t=3, c=1, mo=2, r;
        r=256000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba20(){
        int ma=1, d=1, t=4, c=1, mo=2, r;
        r=224000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba21(){
        int ma=1, d=2, t=1, c=1, mo=2, r;
        r=384000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba22(){
        int ma=1, d=2, t=2, c=1, mo=2, r;
        r=384000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba23(){
        int ma=1, d=2, t=3, c=1, mo=2, r;
        r=320000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba24(){
        int ma=1, d=2, t=4, c=1, mo=2, r;
        r=288000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba25(){
        int ma=2, d=1, t=1, c=1, mo=2, r;
        r=288000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba26(){
        int ma=2, d=1, t=2, c=1, mo=2, r;
        r=288000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba27(){
        int ma=2, d=1, t=3, c=1, mo=2, r;
        r=224000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba28(){
        int ma=2, d=1, t=4, c=1, mo=2, r;
        r=160000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba29(){
        int ma=2, d=2, t=1, c=1, mo=2, r;
        r=352000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba30(){
        int ma=2, d=2, t=2, c=1, mo=2, r;
        r=352000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba31(){
        int ma=2, d=2, t=3, c=1, mo=2, r;
        r=288000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
    @Test
    public void prueba32(){
        int ma=2, d=2, t=4, c=1, mo=2, r;
        r=256000;
        assertEquals(r, Metodos.resultado(ma,d,t,c,mo),0);
    }
}