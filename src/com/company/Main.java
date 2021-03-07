package com.company;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchElementException {
        System.out.println("Select pattern?");
        System.out.println("1. Builder\n2. Factory Method\n3. Singleton");

        int answer = -1;
        Tester tester = new Tester();

        Scanner scan = new Scanner(System.in);
        answer = scan.nextInt();

        switch (answer) {
            case 1:
                tester.testBuilder(scan);
                break;
            case 2:
                tester.testFactory(scan);
                break;
            case 3:
                tester.testSingleton();
                break;
        }
    }

}