package com.vicky;
public abstract class BaseClass implements GameInterface {
    private String name;
    private Integer hp;
    private Integer attack;
    private Integer defence;
    private Integer damageMin;
    private Integer damageMax;
    private Integer hpMax;
    private Integer speed;

    public BaseClass(String name, Integer hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.hpMax = hpMax;
        this.speed = speed;
    }

    @Override
    public String getInfo() {
        return "Я персонаж";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getDamageMin() {
        return damageMin;
    }

    public void setDamageMin(Integer damageMin) {
        this.damageMin = damageMin;
    }

    public Integer getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(Integer damageMax) {
        this.damageMax = damageMax;
    }

    public Integer getHpMax() {
        return hpMax;
    }

    public void setHpMax(Integer hpMax) {
        this.hpMax = hpMax;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return getInfo() + "{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defence=" + defence +
                ", damageMin=" + damageMin +
                ", damageMax=" + damageMax +
                ", hpMax=" + hpMax +
                ", speed=" + speed +
                '}';
    }
}
