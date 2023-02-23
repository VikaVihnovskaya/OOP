package com.vicky;

public abstract class MagicClass extends BaseClass{
    private Integer mana;


    public MagicClass(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed);
        this.mana = 1;
    }
}

