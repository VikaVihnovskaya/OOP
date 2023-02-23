package com.vicky;

public abstract class DogFace extends BaseClass implements HelpInterface, AttackInterface {

    public DogFace(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed) {

        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
    }


    @Override
    public void help() {

    }

    @Override
    public void attack() {

    }
}
