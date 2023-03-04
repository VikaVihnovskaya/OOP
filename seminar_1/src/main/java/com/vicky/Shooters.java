package com.vicky;

import java.util.List;
import java.util.Optional;

public abstract class Shooters extends BaseClass implements ShootInterface{
    private Integer shots;


    public Shooters(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Integer shots, Coordinate coordinate) {
        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
        this.shots = shots;
    }

    public Integer getShots() {
        return shots;
    }

    public void setShots(Integer shots) {
        this.shots = shots;
    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {
        if (getState().equals(Status.DIE) || getShots() == 0) return;
        BaseClass nearestEnemy = gameClassFinder.findNearest(this, enemies);
        System.out.printf(getInfo() + " :" + getName() + ". Найден ближайший враг %s", nearestEnemy);
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
    public void shoot() {

    }

    @Override
    public void reload() {

    }
}

