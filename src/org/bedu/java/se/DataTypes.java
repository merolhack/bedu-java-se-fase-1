package org.bedu.java.se;

import org.bedu.java.se.helpers.Printer;

/**
 * 
 */
public class DataTypes {
    public DataTypes() {
        Printer.printMessage("1: Tipos de datos: DataTypes.java");
    }

    /**
     * Print data on console
     */
    public void show() {
        
        // Declaración e Inicialización
        int integerNumber = 10;
        Printer.printMessage("Integer number", integerNumber);
        float floatNumber = 5.67F;
        Printer.printMessage("Float number", floatNumber);
        double doubleNumber = 1.55;
        Printer.printMessage("Double number", doubleNumber);
        int castedFloatNumber = (int) floatNumber;
        Printer.printMessage("Casted float number", castedFloatNumber);

        char numChar = '@';
        int numCharValue = (int) numChar;
        System.out.println(numCharValue);
    }
}
