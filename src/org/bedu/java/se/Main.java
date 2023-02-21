package org.bedu.java.se;

/**
 * @author: Lenin Meza merolhack@gmail.com
 */
public class Main {
    public static void main(String[] args) {


        System.out.println("BEDU: Beca Santander - Fase 1");
        System.out.println("Selecciona una opción (número):\n");
        System.out.println(" * 1: Tipos de datos: DataTypes.java");
        System.out.println(" * 2: Sentencias de control de flujo: ControlFlowStatements.java");
        System.out.println(" * 3: Clases y objetos: ClassesAndObjects.java");
        System.out.println(" * 4: Cadenas de texto: Strings.java");
        System.out.println(" * 5: Herencia: ?.java");
        System.out.println(" * 6: Polimorfismo: ?.java");
        System.out.println(" * 7: Colecciones: Collections.java");
        System.out.println(" * 8: Administración de archivos: FileManagement.java");
        System.out.println(" * 9: Formatos de texto y fecha: TextAndDateFormats.java");

        System.out.println("DRY: Don't repeat yourself");
        System.out.println(" * Promueve la reducción de duplicación en programación.");
        System.out.println(" * Las piezas de información nunca deben duplicarse.");
        System.out.println(" * Incrementa la dificultad en los cambios y evolución.");

        Polimorfismo:
         * Posibilidad de sobreescribir un método con comportamientos diferentes.
        En POO tenemos 3 clases de polimorfismo:
         * Sobrecarga: Podemos escribir un método con el mismo nombre varias veces cambiando los parámetros que recibe ya sea en cantidad o en tipos, ademas podemos retornar otro tipo de dato.
         * Sobreescritura: Podemos escribir un método de la clase padre y cambiar su contenido y asi realizar comportamiento mas especifico.
         * Ligadura Dinámica: Podemos ejemplificar a las clases hijas pero tratarlas como su clase padre, puede ser util por ejemplo si queremos un arreglo que contenga objetos tipo User pero que implícitamente también va a contener doctores y pacientes:

        DataTypes dataTypes = new DataTypes();
        dataTypes.show();

        ControlFlowStatements controlFlowStatements = new ControlFlowStatements();
        controlFlowStatements.show();
        
        ClassesAndObjects classesAndObjects = new ClassesAndObjects();
        classesAndObjects.show();

        Strings strings = new Strings();
        strings.show();

        Collections collections = new Collections();
        collections.show();

        FileManagement fileManagement = new FileManagement();
        fileManagement.show();

        TextAndDateFormats textAndDateFormats = new TextAndDateFormats();
        textAndDateFormats.show();
    }
}
