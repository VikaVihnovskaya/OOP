package com.vicky;
public class DogFace extends BaseClass implements HelpInterface, AttackInterface {
    private Integer stamina;

    public DogFace(String name, Integer level, Integer hp, Integer power, String tool, Integer stamina) {
        super(name, level, hp, power, tool);
        this.stamina = stamina;
    }



    @Override
    public void help() {

    }

    @Override
    public void attack() {

    }
}
