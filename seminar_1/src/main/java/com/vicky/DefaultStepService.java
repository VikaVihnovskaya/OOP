package com.vicky;

import java.util.List;

public class DefaultStepService implements StepService{
    private final FieldChecker fieldChecker;

    public DefaultStepService() {
        this.fieldChecker = new DefaultFieldChecker();
    }

    @Override
    public void stepDown(BaseClass baseClass ) {
        int currentYPos = baseClass.getCoordinate().getY();
        baseClass.getCoordinate().setY(currentYPos - 1);
    }

    @Override
    public void stepUp(BaseClass baseClass) {
        int currentYPos = baseClass.getCoordinate().getY();
        baseClass.getCoordinate().setY(currentYPos + 1);
    }

    @Override
    public void stepSide(BaseClass baseClass, List<BaseClass> team, BaseClass enemy) {
        if(fieldChecker.isLeftCellEmpty(baseClass.getCoordinate(), enemy.getCoordinate())){
            if(fieldChecker.isCellEmpty(team, baseClass.getCoordinate().getX() - 1, baseClass.getCoordinate().getY())){
                int currentXPos = baseClass.getCoordinate().getX();
                baseClass.getCoordinate().setX(currentXPos - 1);
            }
        } else {
            if(fieldChecker.isCellEmpty(team, baseClass.getCoordinate().getX() + 1, baseClass.getCoordinate().getY())){
                int currentXPos = baseClass.getCoordinate().getX();
                baseClass.getCoordinate().setX(currentXPos + 1);
            }
        }
    }
}
