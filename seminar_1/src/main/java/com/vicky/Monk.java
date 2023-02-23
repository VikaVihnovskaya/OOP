package com.vicky;

public class Monk extends MagicClass implements HealInterface{
    private final Boolean pray;

    public Monk(String name) {
        super(name, 30, 12, 7, -4, -4, 30, 5);
        this.pray = true;
    }


    @Override
    public void heal() {

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я монах!";
    }
}
