package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class Wizard extends MagicClass implements HealInterface{
    private final Boolean spells;

    public Wizard(String name, Integer x, Integer y) {
        super(name,30f, 17, 12, -5, -5, 30, 9, new Coordinate(x, y));
        this.spells = true;
    }

    public Wizard(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Boolean spells, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
        this.spells = spells;
    }

    @Override
    public void heal() {

    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {

    }

    @Override
    public String getInfo() {
        return "Я колдун!";
    }
}
