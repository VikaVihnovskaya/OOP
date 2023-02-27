package com.vicky;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Archer extends Shooters implements HelpInterface, ShootInterface {

    public Archer(String name, Integer x, Integer y) {
        super(name, 10f, 6, 3, 2, 3, 10, 4, 16, new Coordinate(x, y));
    }

    public Archer(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, shots, coordinate);
    }

    @Override
    public void help() {

    }

    @Override
    public void shoot() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {
        if (getState().equals(Status.DIE) || getShots() == 0) return;
        BaseClass nearestEnemy = gameClassFinder.findNearest(this, enemies);
        System.out.printf(getInfo() + "Найден ближайший враг %s", nearestEnemy);
        System.out.println();
        float damage = (nearestEnemy.getDefence() - getAttack() > 0) ? getDamageMin() : (nearestEnemy.getDefence() - getAttack() < 0) ? getDamageMax() : (getDamageMax() + getDamageMin()) / 2;
        nearestEnemy.getDamage(damage);

        Optional<BaseClass> countryMan = allies.stream()
                .filter(CountryMen.class::isInstance)
                .filter(baseClass -> baseClass.getState().equals(Status.STAND))
                .findFirst();
        if (countryMan.isEmpty()) {
            int decreasedNumberOfShots = getShots() - 1;
            setShots(decreasedNumberOfShots);
        }

    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";

    }
}
