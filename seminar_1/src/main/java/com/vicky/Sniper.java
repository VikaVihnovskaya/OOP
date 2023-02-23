package com.vicky;

public class Sniper extends Shooters implements ShootInterface {
    public Sniper(String name) {

        super(name,10, 12, 10, 8, 10, 10, 9, 32);
    }

    public Sniper(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, shots);
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
