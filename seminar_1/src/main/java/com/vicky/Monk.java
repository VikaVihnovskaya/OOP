package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class Monk extends MagicClass implements HealInterface{
    private final Boolean pray;

    public Monk(String name, Integer x, Integer y) {
        super(name, 30f, 12, 7, -4, -4, 30, 5, new Coordinate(x, y));
        this.pray = true;
    }


    @Override
    public void heal() {

    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {

    }

    @Override
    public String getInfo() {
        return "Я монах!";
    }
}
