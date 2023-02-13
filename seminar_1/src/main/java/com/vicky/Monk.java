package com.vicky;

public class Monk extends MagicClass implements HealInterface{
    private Boolean pray;

    public Monk(String name, Integer level, Integer hp, Integer power, String tool, Integer mana, Boolean pray) {
        super(name, level, hp, power, tool, mana);
        this.pray = pray;
    }

    @Override
    public void heal() {

    }
}
