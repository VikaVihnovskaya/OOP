package com.vicky;

import java.util.List;

public interface GameClassFinder {

    BaseClass findNearest(BaseClass currentClass, List<BaseClass> team);
    BaseClass findNearestWithLowHp(List<BaseClass> team);
}
