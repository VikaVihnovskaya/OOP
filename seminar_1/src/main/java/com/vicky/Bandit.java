package com.vicky;

public class Bandit extends DogFace implements HideInterface{

    public Bandit(String name) {
        super(name, 1, 100, 100, "Knife", 10);
    }

    @Override
    public void hide() {
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }
}
