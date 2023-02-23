package com.vicky;

public class Pikeman extends DogFace implements RunAwayInterface{

    public Pikeman(String name) {

        super(name, 10, 4, 5, 1, 3, 10, 4);
    }

    public Pikeman(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
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
