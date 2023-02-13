package com.vicky;
public class Archer extends Shooters implements HelpInterface, ShootInterface {

    public Archer(String name, Integer level, Integer hp, Integer power, String tool, Integer focus, Integer shells) {
        super(name, level, hp, power, tool, focus, shells);
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
}
