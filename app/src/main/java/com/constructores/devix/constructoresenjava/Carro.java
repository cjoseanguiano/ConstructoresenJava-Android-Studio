package com.constructores.devix.constructoresenjava;
/*
 *Created by Carlos Anguiano on 23/01/17.
 */

public class Carro {


    private String color;
    private String tipo;


    public Carro(String color, String tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
