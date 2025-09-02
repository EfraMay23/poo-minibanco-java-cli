package org.ejercicio.banco;

public class Cliente {
    String nombre;
    long dni;
    
    Cliente (String str, long num) {
        this.dni = num;
        this.nombre = str;
    }
    public Cliente(){}
}