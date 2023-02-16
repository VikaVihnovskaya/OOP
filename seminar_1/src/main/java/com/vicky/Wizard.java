package com.vicky;

public class Wizard extends MagicClass implements HealInterface{
    private final Boolean spells;

    public Wizard(String name) {
        super(name, 1, 100, 100, "Stick", 20);
        this.spells = true;
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
