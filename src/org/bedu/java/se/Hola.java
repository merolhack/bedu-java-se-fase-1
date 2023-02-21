package org.bedu.java.se;

import java.util.Date;

public class Hola {
    public static void main(String[] args) {
        String NOMBRE = "Lenin";
        int EDAD = 99;
        Float PROMEDIO = 120f;
        Date FECHA_NACIMIENTO = new Date();
        System.out.println(String.format("Mi nombre es %8s, tengo %05d años, mi promedio es de %.2f y nací el día %4$te de %4$tB de %4$tY", NOMBRE, EDAD, PROMEDIO, FECHA_NACIMIENTO));
    }
}
