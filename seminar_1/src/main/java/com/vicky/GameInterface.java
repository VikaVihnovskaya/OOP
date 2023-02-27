package com.vicky;

import java.util.ArrayList;
import java.util.List;

public interface GameInterface {
    void step(List<BaseClass> allies, List<BaseClass> enemies);
    String getInfo();
}
