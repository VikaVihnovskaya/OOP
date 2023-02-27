package com.vicky;

import java.util.List;

public class CoordGameClassFinder implements GameClassFinder {

    @Override
    public BaseClass findNearest(BaseClass currentClass, List<BaseClass> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            BaseClass opponent = team.get(i);
            if (min > getDistance(currentClass.getCoordinate(), opponent.getCoordinate()) && !opponent.getState().equals(Status.DIE)) {
                index = i;
                min = getDistance(currentClass.getCoordinate(), opponent.getCoordinate());
            }
        }
        return team.get(index);
    }

    protected Double getDistance(Coordinate currentClassCoords, Coordinate opponentCoords) {
        return Math.sqrt(Math.pow(currentClassCoords.getX().doubleValue() - opponentCoords.getY().doubleValue(), 2) + Math.pow(currentClassCoords.getY().doubleValue() - opponentCoords.getY().doubleValue(), 2));
    }
}
