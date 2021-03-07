package com.company;

import com.company.patterns.builder.Director;
import com.company.patterns.builder.House;
import com.company.patterns.builder.HouseBuilder;
import com.company.patterns.builder.Type;
import com.company.patterns.factory.Factory;
import com.company.patterns.factory.ShipF;
import com.company.patterns.factory.TruckF;
import com.company.patterns.singleton.DB;

import java.util.Scanner;

public class Tester {

    void testSingleton() {
        System.out.print("User: ");
        System.out.println(DB.getInstance().getUser());
    }


    static void testFactory(Scanner sc) {
        Factory factory = null;

        System.out.println("Delivery type?");
        System.out.println("1. By truck \n2. By ship");

        int answer = sc.nextInt();

        switch (answer) {
            case 1:
                factory = new TruckF();
                break;
            case 2:
                factory = new ShipF();
                break;
        }

        factory.deliver();
        sc.close();
    }

    static void testBuilder(Scanner sc) {
        HouseBuilder builder = new HouseBuilder();
        Director director = new Director();


        System.out.println("Choose house type:");
        System.out.println("1. Default");
        System.out.println("2. With garage");
        System.out.println("3. With playground");
        System.out.println("4. With fence");
        System.out.println("5. With garden");

        int answer = sc.nextInt();

        switch (answer) {
            case 1:
                director.constructHouse(Type.DEFAULT, builder);
                break;
            case 2:
                director.constructHouse(Type.WITHGARAGE, builder);
                break;
            case 3:
                director.constructHouse(Type.WITHPLAYGROUND, builder);
                break;
            case 4:
                director.constructHouse(Type.WITHFENCE, builder);
                break;
            case 5:
                director.constructHouse(Type.WITHGARAGE, builder);
                break;
        }

        House house = builder.getResult();

        house.print();
        sc.close();
    }
}
