package com.vicky;

import java.util.List;

public interface StepService {
    void stepDown(BaseClass baseClass);

    void stepUp(BaseClass baseClass);

    void stepSide(BaseClass baseClass, List<BaseClass> team, BaseClass enemy);
}
