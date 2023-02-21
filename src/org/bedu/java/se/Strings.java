package org.bedu.java.se;

/**
 * 
 */
public class Strings {
    public Strings() {

    }

    /*+
     * Print data on console
     */
    public void show() {
        String str = new String("Hola! ¿Cómo estás?");

        System.out.println("Longitud: " + str.length());
        System.out.println("Caracter en la posición 0: " + str.charAt(0));
        System.out.println("SubCadena en la posición 2: " + str.substring(2));
        System.out.println(": " + str.indexOf("Hola"));
        System.out.println(": " + str.lastIndexOf('o'));
        System.out.println(": " + str.equals("Hola! ¿Cómo estás?"));
        System.out.println(": " + str.compareTo("Hola! ¿Cómo estás?"));
        System.out.println(": " + str.toLowerCase());
        System.out.println(": " + str.toUpperCase());
        System.out.println(": " + str.trim());
        System.out.println(": " + str.replace('o', 'i'));
    }
}
