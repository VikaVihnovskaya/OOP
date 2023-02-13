package com.vicky;

public class Wizard extends MagicClass implements HealInterface{
    private Boolean spells;

    public Wizard(String name, Integer level, Integer hp, Integer power, String tool, Integer mana, Boolean spells) {
        super(name, level, hp, power, tool, mana);
        this.spells = spells;
    }

    @Override
    public void heal() {

    }
}
