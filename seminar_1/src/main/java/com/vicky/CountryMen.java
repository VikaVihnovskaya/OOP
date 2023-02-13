package com.vicky;
public class CountryMen extends BaseClass implements HelpInterface, HideInterface, RunAwayInterface {
    public CountryMen(String name, Integer level, Integer hp, Integer power, String tool) {
        super(name, level, hp, power, tool);
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
}
