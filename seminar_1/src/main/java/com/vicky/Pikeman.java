package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class Pikeman extends DogFace implements RunAwayInterface{

    public Pikeman(String name, Integer x, Integer y) {

        super(name, 10f, 4, 5, 1, 3, 10, 4, new Coordinate(x, y));
    }

    public Pikeman(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
    }

    @Override
    public void runAway() {

    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {

    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }
}
