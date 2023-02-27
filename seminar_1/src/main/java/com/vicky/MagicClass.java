package com.vicky;

public abstract class MagicClass extends BaseClass{
    private Integer mana;


    public MagicClass(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
        this.mana = 1;
    }
}

