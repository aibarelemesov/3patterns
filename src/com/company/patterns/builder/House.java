package com.company.patterns.builder;

import java.util.ArrayList;

public class House {
    private final String garage = "garage";
    private final String playground = "playground";
    private final String garden = "garden";
    private final String fence = "fence";

    private final String floor = "floor";
    private final String walls = "walls";
    private final String roof = "roof";

    private ArrayList<String> components = new ArrayList<String>();

    public void print() {
        System.out.println("House: ");
        for (String component : this.components) {
            System.out.println("– with " + component);
        }
    }

    public House(Boolean needsGarage, Boolean needsPlayGround, Boolean needsGarden, Boolean needsFence) {

        this.components.add(this.floor);
        this.components.add(this.walls);
        this.components.add(this.roof);

        if (needsGarage) {
            this.components.add(this.garage);
        }
        if (needsPlayGround) {
            this.components.add(this.playground);
        }
        if (needsGarden) {
            this.components.add(this.garden);
        }
        if (needsFence) {
            this.components.add(this.fence);
        }
    }
}
