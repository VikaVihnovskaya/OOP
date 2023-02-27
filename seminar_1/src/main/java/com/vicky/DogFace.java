package com.vicky;

public abstract class DogFace extends BaseClass implements HelpInterface, AttackInterface {

    public DogFace(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Coordinate coordinate) {

        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
    }


    @Override
    public void help() {

    }

    @Override
    public void attack() {

    }
}
