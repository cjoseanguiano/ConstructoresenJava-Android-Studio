package com.constructores.devix.constructoresenjava;

/*
 * Created by Carlos Anguiano on 23/01/17.
 */

public class Perro {

    private String color;
    private int edad;
    protected String raza;


    public Perro(){
        this.color="Blanco";
        this.edad = 0;
        this.raza = null;
    }

//    public Perro(String color, int edad, String raza) {
//        this.color = color;
//        this.edad = edad;
//        this.raza = raza;
//    }


    @Override
    public String toString() {
        return "Perro{" +
                "color='" + color + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
