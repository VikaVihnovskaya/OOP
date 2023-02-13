package com.vicky;

public class MagicClass extends BaseClass{
    private Integer mana;

    public MagicClass(String name, Integer level, Integer hp, Integer power, String tool, Integer mana) {
        super(name, level, hp, power, tool);
        this.mana = mana;
    }
}
