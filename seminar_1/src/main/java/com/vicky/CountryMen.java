package com.vicky;
public class CountryMen extends BaseClass implements HelpInterface, HideInterface, RunAwayInterface {

    public CountryMen(String name) {
        super(name, 1, 50, 30, "Stick");
    }

    @Override
    public void help() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void runAway() {
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я крестьянин!";
    }
}
