package org.bedu.java.se.helpers;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public String readInput() {
        String input = scanner.nextLine();
        return input;
    }
}
