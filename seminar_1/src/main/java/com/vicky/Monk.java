package com.vicky;

public class Monk extends MagicClass implements HealInterface{
    private final Boolean pray;

    public Monk(String name) {
        super(name, 1, 100, 50, "Book", 10);
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
