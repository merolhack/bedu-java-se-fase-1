package org.bedu.java.se.helpers;

/**
 * @author: Lenin Meza merolhack@gmail.com
 */
public final class Printer {
    
    /**
     * 
     * @param message
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * 
     * @param message
     * @param value
     */
    public static void printMessage(String message, String value) {
        System.out.println(message + ": " + value);
    }

    /**
     * 
     * @param message
     * @param value
     */
    public static void printMessage(String message, Integer value) {
        System.out.println(message + ": " + value);
    }

    /**
     * 
     * @param message
     * @param value
     */
    public static void printMessage(String message, Float value) {
        System.out.println(message + ": " + value);
    }

    /**
     * 
     * @param message
     * @param value
     */
    public static void printMessage(String message, Double value) {
        System.out.println(message + ": " + value);
    }

    /**
     * 
     * @param message
     */
    private static void printSeparator(String message) {
        System.out.println("==[" + message + "]========================");
    }
}
