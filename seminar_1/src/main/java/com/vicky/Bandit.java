package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class Bandit extends DogFace implements HideInterface{


    public Bandit(String name, Integer x, Integer y) {
        super(name, 10f, 8, 3, 2, 4, 10, 6, new Coordinate(x, y));
    }

    public Bandit(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
    }

    @Override
    public void hide() {
    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }
}
