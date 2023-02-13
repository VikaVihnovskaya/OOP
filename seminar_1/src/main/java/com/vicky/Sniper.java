package com.vicky;

public class Sniper extends Shooters implements ShootInterface{
    public Sniper(String name, Integer level, Integer hp, Integer power, String tool, Integer focus, Integer shells) {
        super(name, level, hp, power, tool, focus, shells);
    }

    @Override
    public void shoot() {

    }

    @Override
    public void reload() {

    }
}
