package com.vicky;
public class CountryMen extends BaseClass implements HelpInterface, HideInterface, RunAwayInterface {
    private Integer delivery;

    public CountryMen(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 3);
        this.delivery = 1;
    }

    public CountryMen(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer delivery) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я крестьянин!";
    }
}
