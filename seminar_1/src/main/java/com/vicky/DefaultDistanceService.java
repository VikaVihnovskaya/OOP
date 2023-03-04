package com.vicky;

public class DefaultDistanceService implements DistanceService {

    @Override
    public Double getDistance(Coordinate currentClassCoords, Coordinate opponentCoords) {
        return Math.sqrt(Math.pow(currentClassCoords.getX().doubleValue() - opponentCoords.getY().doubleValue(), 2) + Math.pow(currentClassCoords.getY().doubleValue() - opponentCoords.getY().doubleValue(), 2));
    }
}
