package com.company.patterns.builder;

public class HouseBuilder implements Builder{
    private Boolean needsGarage = false;
    private Boolean needsPlayGround = false;
    private Boolean needsGarden = false;
    private Boolean needsFence = false;

    @Override
    public void buildGarage() {
        this.needsGarage = true;
    }

    @Override
    public void buildPlayGround() {
        this.needsPlayGround = true;
    }

    @Override
    public void buildGarden() {
        this.needsGarden = true;
    }

    @Override
    public void buildFence() {
        this.needsFence = true;
    }

    public House getResult() {
        return new House(this.needsGarage, this.needsPlayGround, this.needsGarden, this.needsFence);
    }
}
