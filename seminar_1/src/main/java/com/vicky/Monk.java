package com.vicky;

import java.util.List;

public class Monk extends MagicClass implements HealInterface {
    private final Boolean pray;

    public Monk(String name, Integer x, Integer y) {
        super(name, 30f, 12, 7, -4, -4, 30, 5, new Coordinate(x, y));
        this.pray = true;
    }


    @Override
    public void heal(BaseClass ally) {
        ally.setHp(ally.getHpMax().floatValue());
    }

    @Override
    public void step(List<BaseClass> allies, List<BaseClass> enemies) {
        if(getState().equals(Status.DIE)){
            return;
        }
        BaseClass nearestAllyWIthLowHp = gameClassFinder.findNearestWithLowHp(allies);
        if (nearestAllyWIthLowHp != null) {
            System.out.printf(getInfo() + " :" + getName() + ". Найден ближайший союзник %s", nearestAllyWIthLowHp);
            System.out.println();
            heal(nearestAllyWIthLowHp);
        } else {
            System.out.println(getInfo() + " :" + getName() + ". Ближайший союзник не найден");
        }
    }

    @Override
    public String getInfo() {
        return "Я монах!";
    }
}
