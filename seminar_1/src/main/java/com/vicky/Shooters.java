package com.vicky;

public class Shooters extends BaseClass{
    private Integer focus;
    private Integer shells;

    public Shooters(String name, Integer level, Integer hp, Integer power, String tool, Integer focus, Integer shells) {
        super(name, level, hp, power, tool);
        this.focus = focus;
        this.shells = shells;
    }
}
