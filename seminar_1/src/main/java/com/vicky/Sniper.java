package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends Shooters implements ShootInterface {
    public Sniper(String name, Integer x, Integer y) {

        super(name,10f, 12, 10, 8, 10, 10, 9, 32, new Coordinate(x,y));
    }

    public Sniper(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, shots, coordinate);
    }

    @Override
    public void shoot() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {

    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }
}
