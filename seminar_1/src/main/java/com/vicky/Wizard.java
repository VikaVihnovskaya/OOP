package com.vicky;

public class Wizard extends MagicClass implements HealInterface{
    private final Boolean spells;

    public Wizard(String name) {
        super(name,30, 17, 12, -5, -5, 30, 9);
        this.spells = true;
    }

    public Wizard(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Boolean spells) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
        this.spells = spells;
    }

    @Override
    public void heal() {

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я колдун!";
    }
}
