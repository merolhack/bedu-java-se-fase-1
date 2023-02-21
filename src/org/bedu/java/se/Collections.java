package org.bedu.java.se;

import java.util.ArrayList;

/**
 * 
 */
public class Collections {
    public Collections() {
        
    }

    public static void main(String[] args) {
        ArrayList integerList = new ArrayList<Integer>();
        System.out.println(integerList.size());
        integerList.add(69);
        integerList.add(70);
        System.out.println(integerList.size());

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }

    /**
     * Print data on console
     */
    public void show() {

    }
}
