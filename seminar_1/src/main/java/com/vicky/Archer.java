package com.vicky;
public class Archer extends Shooters implements HelpInterface, ShootInterface {

    public Archer(String name) {
        super(name, 1, 100, 100,"Crossbow", 12, 10);

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
