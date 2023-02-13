package com.vicky;

public class Pikeman extends DogFace implements RunAwayInterface{
    public Pikeman(String name, Integer level, Integer hp, Integer power, String tool, Integer stamina) {
        super(name, level, hp, power, tool, stamina);
    }

    @Override
    public void runAway() {

    }
}
