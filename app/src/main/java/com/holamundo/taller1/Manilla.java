package com.holamundo.taller1;

public class Manilla {
    private String material;
    private String dije;
    private String tipo;

    public Manilla(String material, String dije, String tipo) {
        this.material = material;
        this.dije = dije;
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDije() {
        return dije;
    }

    public void setDije(String dije) {
        this.dije = dije;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
