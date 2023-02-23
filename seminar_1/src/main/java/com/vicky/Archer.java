package com.vicky;
public class Archer extends Shooters implements HelpInterface, ShootInterface {

    public Archer(String name) {
        super(name, 10, 6, 3, 2, 3, 10, 4, 16);
    }

    public Archer(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, shots);
    }

    @Override
    public void help() {

    }

    @Override
    public void shoot() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";

    }
}
