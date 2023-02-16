package com.vicky;

public class Pikeman extends DogFace implements RunAwayInterface{

    public Pikeman(String name) {
        super(name, 1,100, 50, "Pika", 10);
    }

    @Override
    public void runAway() {

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }
}
