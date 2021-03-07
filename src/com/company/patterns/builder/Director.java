package com.company.patterns.builder;

public class Director {
    public void constructHouse(Type type, Builder builder) {
        switch (type) {
            case DEFAULT:
                break;
            case WITHGARAGE:
                builder.buildGarage();
                break;
            case WITHPLAYGROUND:
                builder.buildPlayGround();
                break;
            case WITHGARDEN:
                builder.buildGarden();
                break;
            case WITHFENCE:
                builder.buildFence();
                break;
        }
    }
}
