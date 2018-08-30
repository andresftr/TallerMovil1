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

    public static int resultado(int op_mat, int op_dij, int op_tip, int cant, int op_mon){
        int total = 0;
        if (op_mat == 1) {
            if (op_dij == 1) {
                if (op_tip == 1 || op_tip == 2) {
                    total = calcular(cant, 100, op_mon);
                }
                if (op_tip == 3) {
                    total = calcular(cant, 80, op_mon);
                }
                if (op_tip == 4) {
                    total = calcular(cant, 70, op_mon);
                }
            }
            if (op_dij == 2) {
                if (op_tip == 1 || op_tip == 2) {
                    total = calcular(cant, 120, op_mon);
                }
                if (op_tip == 3) {
                    total = calcular(cant, 100, op_mon);
                }
                if (op_tip == 4) {
                    total = calcular(cant, 90, op_mon);
                }
            }
        }
        if (op_mat == 2) {
            if (op_dij == 1) {
                if (op_tip == 1 || op_tip == 2) {
                    total = calcular(cant, 90, op_mon);
                }
                if (op_tip == 3) {
                    total = calcular(cant, 70, op_mon);
                }
                if (op_tip == 4) {
                    total = calcular(cant, 50, op_mon);
                }
            }
            if (op_dij == 2) {
                if (op_tip == 1 || op_tip == 2) {
                    total = calcular(cant, 110, op_mon);
                }
                if (op_tip == 3) {
                    total = calcular(cant, 90, op_mon);
                }
                if (op_tip == 4) {
                    total = calcular(cant, 80, op_mon);
                }
            }
        }
        return total;
    }
}
