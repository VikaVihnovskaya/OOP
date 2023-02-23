package com.vicky;

public class Bandit extends DogFace implements HideInterface{


    public Bandit(String name) {
        super(name, 10, 8, 3, 2, 4, 10, 6);
    }

    public Bandit(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
    }

    @Override
    public void hide() {
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }
}
