package com.vicky;

public class Bandit extends DogFace implements HideInterface{
    public Bandit(String name, Integer level, Integer hp, Integer power, String tool, Integer stamina) {
        super(name, level, hp, power, tool, stamina);
    }

    @Override
    public void hide() {

    }
}
