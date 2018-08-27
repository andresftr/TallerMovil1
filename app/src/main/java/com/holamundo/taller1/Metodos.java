package com.holamundo.taller1;

public class Metodos {
    public static int calcular(int cant, int subtotal, int moneda) {
        int resp = 0;
        if (moneda ==1) {
            resp = cant * subtotal;
        }
        if (moneda ==2){
            resp = (cant * subtotal)*3200;
        }
        return resp;
    }
}
