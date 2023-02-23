package com.vicky;

public abstract class Shooters extends BaseClass {
    private Integer shots;


    public Shooters(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
        this.shots = shots;

    }
}

