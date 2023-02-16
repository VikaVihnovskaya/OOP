package com.vicky;
public abstract class BaseClass implements GameInterface {
    private String name;
    private Integer level;
    private Integer hp;
    private Integer power;
    private String tool;

    public BaseClass(String name, Integer level, Integer hp, Integer power, String tool) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.power = power;
        this.tool = tool;

    }

    @Override
    public String getInfo() {
        return "Я персонаж";
    }
}
