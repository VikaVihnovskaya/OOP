package com.vicky;

import java.util.ArrayList;
import java.util.List;

public class CountryMen extends BaseClass implements HelpInterface, HideInterface, RunAwayInterface {
    private Integer delivery;

    public CountryMen(String name, Integer x, Integer y) {
        super(name, 1f, 1, 1, 1, 1, 1, 3, new Coordinate(x, y));
        this.delivery = 1;
    }

    public CountryMen(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer delivery, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
        this.delivery = delivery;
    }

    @Override
    public void help() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void runAway() {
    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {

    }

    @Override
    public String getInfo() {
        return "Я крестьянин!";
    }
}
