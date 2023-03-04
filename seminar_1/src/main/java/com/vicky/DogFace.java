package com.vicky;

import java.util.List;

public abstract class DogFace extends BaseClass implements HelpInterface, AttackInterface {

    public DogFace(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Coordinate coordinate) {

        super(name, hp, attack, defence, damageMin, damageMax, hpMax, speed, coordinate);
    }


    @Override
    public void help() {

    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {
        if (getState().equals(Status.DIE)) {
            return;
        }
        BaseClass nearestEnemy = gameClassFinder.findNearest(this, enemies);
        if (distanceService.getDistance(this.getCoordinate(), nearestEnemy.getCoordinate()) < 2) {
            float damage = (nearestEnemy.getDefence() - getAttack() > 0) ? getDamageMin() : (nearestEnemy.getDefence() - getAttack() < 0) ? getDamageMax() : (getDamageMax() + getDamageMin()) / 2;
            nearestEnemy.getDamage(damage);
        }
        if (fieldChecker.isDownCellEmpty(this.getCoordinate(), nearestEnemy.getCoordinate())) {
            if (this.getCoordinate().getY() - 1 > nearestEnemy.getCoordinate().getY() && fieldChecker.isCellEmpty(allies, this.getCoordinate().getX(), this.getCoordinate().getY() - 1)) {
                stepService.stepDown(this);
            } else {
                stepService.stepSide(this, allies, nearestEnemy);
            }

        } else {
            if (this.getCoordinate().getY() + 1 < nearestEnemy.getCoordinate().getY() && fieldChecker.isCellEmpty(allies, this.getCoordinate().getX(), this.getCoordinate().getY() + 1)) {
                stepService.stepUp(this);
            } else {
                stepService.stepSide(this, allies, nearestEnemy);
            }
        }
    }

    @Override
    public void attack() {

    }
}
