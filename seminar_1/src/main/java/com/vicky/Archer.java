package com.vicky;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Archer extends Shooters implements HelpInterface {

    public Archer(String name, Integer x, Integer y) {
        super(name, 10f, 6, 3, 2, 3, 10, 4, 16, new Coordinate(x, y));
    }

    public Archer(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, shots, coordinate);
    }

    @Override
    public void help() {

    }


    @Override
    public String getInfo() {
        return "Я арбалетчик!";

    }
}
