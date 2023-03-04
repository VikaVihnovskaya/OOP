package com.vicky;

import java.util.List;

public interface FieldChecker {
    boolean isLeftCellEmpty(Coordinate currentUserCoordinate, Coordinate enemyCoordinate);

    boolean isDownCellEmpty(Coordinate currentUserCoordinate, Coordinate enemyCoordinate);

    boolean isCellEmpty(List<BaseClass> team, int posX, int posY);
}
