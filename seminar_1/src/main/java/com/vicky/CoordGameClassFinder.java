package com.vicky;

import java.util.List;

public class CoordGameClassFinder implements GameClassFinder {

    private final DistanceService distanceService;

    public CoordGameClassFinder() {
        this.distanceService = new DefaultDistanceService();
    }

    @Override
    public BaseClass findNearest(BaseClass currentClass, List<BaseClass> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            BaseClass opponent = team.get(i);
            if (min > distanceService.getDistance(currentClass.getCoordinate(), opponent.getCoordinate()) && !opponent.getState().equals(Status.DIE)) {
                index = i;
                min = distanceService.getDistance(currentClass.getCoordinate(), opponent.getCoordinate());
            }
        }
        return team.get(index);
    }

    @Override
    public BaseClass findNearestWithLowHp(List<BaseClass> team) {
        return team.stream()
                .filter(baseClass -> baseClass.getHp() != baseClass.getHpMax().floatValue())
                .findFirst().orElse(null);
    }
}
