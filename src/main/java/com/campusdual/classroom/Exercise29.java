package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Excepcion");
        } catch (IllegalArgumentException e) {
            System.out.println("Problema evitado: " + e.getMessage());
        }
    }
}
