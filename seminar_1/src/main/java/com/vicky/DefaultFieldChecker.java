package com.vicky;

import java.util.List;
import java.util.Optional;

public class DefaultFieldChecker implements FieldChecker {
    @Override
    public boolean isLeftCellEmpty(Coordinate currentUserCoordinate, Coordinate enemyCoordinate) {

        return enemyCoordinate.getX() < currentUserCoordinate.getX();
    }

    @Override
    public boolean isDownCellEmpty(Coordinate currentUserCoordinate, Coordinate enemyCoordinate) {
        return enemyCoordinate.getY() < currentUserCoordinate.getY();
    }

    @Override
    public boolean isCellEmpty(List<BaseClass> team, int posX, int posY) {
        Optional<BaseClass> optionalBaseClass = team.stream()
                .filter(baseClass -> baseClass.getCoordinate().getX() == posX)
                .filter(baseClass -> baseClass.getCoordinate().getY() == posY)
                .findFirst();
        return optionalBaseClass.isEmpty();
    }
}
