package com.vicky;

public class Sniper extends Shooters implements ShootInterface {
    public Sniper(String name) {
        super(name, 1, 100, 30, "Gun", 12, 30);
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
        return "Я снайпер!";
    }
}
